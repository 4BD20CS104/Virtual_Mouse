import turtle
colors=['green','blue','white','yellow','red']
t=turtle.Pen()
turtle.bgcolor('black')
for i in range(360):
    t.pencolor(colors[i%5])
    t.width(i/100+1)
    t.forward(i)
    t.left(59)
turtle.exitoneclick()