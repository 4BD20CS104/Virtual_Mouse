import pygame

# Define some colors
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
RED = (255, 0, 0)

# Define screen size
screen_width = 800
screen_height = 600

pygame.init()

screen = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("Simple Surgery Sim")

background_image = pygame.image.load("ICU-transformed.png").convert()

# Define starting shape (modify for your desired shape)
image = pygame.image.load("1923675-removebg-preview.png").convert_alpha()

# Define scalpel position and size
scalpel_x = screen_width // 2
scalpel_y = screen_height // 2

regions = {
    "top_left": [(0, 0), (screen_width // 3, screen_height // 3)],
    "top_right": [(screen_width * 2 // 3, 0), (screen_width, screen_height // 3)],
    "bottom_left": [(0, screen_height * 2 // 3), (screen_width // 3, screen_height)],
    "bottom_right": [(screen_width * 2 // 3, screen_height * 2 // 3), (screen_width, screen_height)],
    "center": [(screen_width // 3, screen_height // 3), (screen_width * 2 // 3, screen_height * 2 // 3)]
}

sound_effects = {
    "top_left": pygame.mixer.Sound("car-horn-beep-beep-two-beeps-honk-honk-6188.mp3"),
    "top_right": pygame.mixer.Sound("bleep-41488.mp3"),
    "bottom_left": pygame.mixer.Sound("bomb-countdown-beeps-6868.mp3"),
    "bottom_right": pygame.mixer.Sound("bomb-countdown-beeps-6868.mp3"),
    "center": pygame.mixer.Sound("car-horn-beep-beep-two-beeps-honk-honk-6188.mp3"),
}

# Track mouse position for scalpel movement
mouse_x, mouse_y = pygame.mouse.get_pos()

playing_sound = False

run = True
while run:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False

    # Check for intersection between scalpel and shape
    collision = False
    clicked_region = None
    for region_name, region_coords in regions.items():
        region_rect = pygame.Rect(*region_coords)  # Create Rect object from coordinates
        if region_rect.collidepoint(mouse_x, mouse_y):
            collision = True
            clicked_region = region_name
            break
      # You'll need to modify this logic to check for collision with the actual image content
    # This is a basic example using image bounding box
    image_rect = image.get_rect(center=(screen_width // 2, screen_height // 2))
    if image_rect.collidepoint(mouse_x, mouse_y):
        collision = True

    # Update screen elements based on collision
    screen.blit(background_image, (0, 0))
    if collision:
        playing_sound = True
        if clicked_region and sound_effects[clicked_region]:  # Play sound if region is found and sound loaded
            sound_effects[clicked_region].play()
        # Red scalpel for collision
        # Modify shape_points to reflect the "cut" (replace with more sophisticated shape manipulation)
        #shape_points = [point for point in shape_points if point != (mouse_x, mouse_y)]
    else:
        playing_sound = False  # White scalpel for no collision
    screen.blit(image, image_rect)
        # Draw the
         # Update previous mouse position for sound control
    prev_mouse_x, prev_mouse_y = mouse_x, mouse_y

    # Update mouse position
    mouse_x, mouse_y = pygame.mouse.get_pos()

    pygame.display.flip()

pygame.quit()
