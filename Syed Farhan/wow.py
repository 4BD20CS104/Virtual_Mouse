import turtle
turtle.forward(15)
t=turtle.Pen()
t.speed(0)
turtle.bgcolor('black')
for i in range(240):
    t.color('cyan')
    t.circle(i)
    t.left(5)
turtle.done()
