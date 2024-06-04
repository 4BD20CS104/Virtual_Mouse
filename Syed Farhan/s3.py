import turtle 
p=turtle.Pen()
colors=['red','green','cyan','yellow']
turtle.bgcolor('blue')
p.speed(1000)
p.width(5)
for i in range(100):
    p.forward(i+200)
    p.pencolor(colors[i%4])
    p.right(i+100)
    p.left(i)
    p.circle(i)
turtle.done()
