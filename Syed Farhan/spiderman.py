import turtle

# Create a turtle object
spiderman = turtle.Turtle()

# Set the background color
turtle.bgcolor("#000")

# Draw Spiderman's head
spiderman.penup()
spiderman.goto(0, 150)
spiderman.pendown()
spiderman.begin_fill()
spiderman.fillcolor("#F01E1E")
spiderman.circle(100)
spiderman.end_fill()

# Draw Spiderman's eyes
spiderman.penup()
spiderman.goto(-40, 200)
spiderman.pendown()
spiderman.begin_fill()
spiderman.fillcolor("#FFF")
spiderman.circle(30)
spiderman.end_fill()

spiderman.penup()
spiderman.goto(40, 200)
spiderman.pendown()
spiderman.begin_fill()
spiderman.fillcolor("#FFF")
spiderman.circle(30)
spiderman.end_fill()

# Draw Spiderman's web
spiderman.penup()
spiderman.goto(0, 50)
spiderman.pendown()
spiderman.pensize(4)
spiderman.pencolor("#FFF")
for i in range(8):
    spiderman.forward(100)
    spiderman.backward(100)
    spiderman.right(45)

# Draw Spiderman's body
spiderman.penup()
spiderman.goto(-50, -50)
spiderman.pendown()
spiderman.begin_fill()
spiderman.fillcolor("#F01E1E")
spiderman.forward(100)


# hide turtle when finished
spiderman.hideturtle()

# keep the window open
turtle.done()
