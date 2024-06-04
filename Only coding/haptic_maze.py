import pygame
import sys
from gtts import gTTS

# Define constants for the width and height of each cell in the maze
CELL_WIDTH = 100
CELL_HEIGHT = 100

# Define colors for the maze
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)

class GraphicalHapticMaze:
    def __init__(self, maze, player_position):
        self.maze = maze
        self.player_position = player_position

        # Initialize pygame
        pygame.init()

        # Initialize the mixer
        pygame.mixer.init()

        # Set the size of the window based on the size of the maze
        self.screen = pygame.display.set_mode((len(maze[0]) * CELL_WIDTH, len(maze) * CELL_HEIGHT))

        # Generate the speech
        tts = gTTS(text="Bump! You hit a wall.", lang='en')
        tts.save("bump.mp3")

        # Load the sound
        self.hit_sound = pygame.mixer.Sound('bump.mp3')

        # Generate the speech for "Congratulations! You reached the end of the maze."
        tts = gTTS(text="Congratulations! You reached the end of the maze.", lang='en')
        tts.save("congratulations.mp3")

        # Load the sound
        self.congratulations_sound = pygame.mixer.Sound('congratulations.mp3')

    def draw_maze(self):
        for i in range(len(self.maze)):
            for j in range(len(self.maze[i])):
                if self.maze[i][j] == 1:
                    pygame.draw.rect(self.screen, BLACK, pygame.Rect(j * CELL_WIDTH, i * CELL_HEIGHT, CELL_WIDTH, CELL_HEIGHT))
                else:
                    pygame.draw.rect(self.screen, WHITE, pygame.Rect(j * CELL_WIDTH, i * CELL_HEIGHT, CELL_WIDTH, CELL_HEIGHT))

        # Draw the player
        pygame.draw.circle(self.screen, (255, 0, 0), (self.player_position[1] * CELL_WIDTH + CELL_WIDTH // 2, self.player_position[0] * CELL_HEIGHT + CELL_HEIGHT // 2), min(CELL_WIDTH, CELL_HEIGHT) // 4)

        # Update the display
        pygame.display.flip()

    def move(self, direction):
        if self.is_valid_move(direction):
            self.player_position = self.get_new_position(direction)
            print("You moved to a new position.")
            self.draw_maze()
        else:
            print("BUMP! You hit a wall.")
            self.hit_sound.play()  # Play the hit sound only when the player hits a wall

    def is_valid_move(self, direction):
        new_position = self.get_new_position(direction)
        # Check if the new position is within the maze and is not a wall
        return (0 <= new_position[0] < len(self.maze) and
                0 <= new_position[1] < len(self.maze[0]) and
                self.maze[new_position[0]][new_position[1]] != 1)

    def get_new_position(self, direction):
        # Get the new position based on the direction of movement
        if direction == 'up':
            return (self.player_position[0] - 1, self.player_position[1])
        elif direction == 'down':
            return (self.player_position[0] + 1, self.player_position[1])
        elif direction == 'left':
            return (self.player_position[0], self.player_position[1] - 1)
        elif direction == 'right':
            return (self.player_position[0], self.player_position[1] + 1)

    def check_end(self):
        # Check if the player has reached the bottom right corner
        if self.player_position == (len(self.maze) - 1, len(self.maze[0]) - 1):
            print("Congratulations! You reached the end of the maze.")
            self.congratulations_sound.play()
            pygame.time.wait(3000)  # Play the congratulations sound
            pygame.quit()
            sys.exit()

# Define a simple maze and player position
maze = [
    [0, 1, 0, 0, 0, 0, 1, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 1, 0],
    [0, 1, 1, 1, 1, 0, 1, 0, 1, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 1, 0],
    [0, 1, 0, 1, 1, 1, 1, 1, 1, 0],
    [0, 1, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 1, 1, 1, 1, 1, 1, 1, 1, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
]

player_position = (0, 0)

# Initialize the game
game = GraphicalHapticMaze(maze, player_position)

# Draw the initial state of the maze
game.draw_maze()

# Game loop
while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_UP:
                game.move('up')
            elif event.key == pygame.K_DOWN:
                game.move('down')
            elif event.key == pygame.K_LEFT:
                game.move('left')
            elif event.key == pygame.K_RIGHT:
                game.move('right')

    game.check_end()
