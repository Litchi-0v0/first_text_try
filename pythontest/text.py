import turtle  
  
# 创建画布和画笔  
canvas = turtle.Screen()  
pen = turtle.Turtle()  
  
# 设置画笔的颜色和粗细  
pen.color('red')  
pen.pensize(3)  
  
# 绘制爱心  
pen.begin_fill()  
pen.left(45)  
pen.forward(100)  
pen.circle(50, 180)  
pen.right(90)  
pen.circle(50, 180)  
pen.forward(100)  
pen.end_fill()  
  
# 隐藏画笔  
pen.hideturtle()  
  
# 显示画布  
canvas.mainloop()