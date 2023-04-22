#为三边赋值
a = int(input('请输入第一条边长：'))
b = int(input('请输入第二条边长：')) 
c = int(input('请输入第三条边长：'))

#求三角形半周长
semi_perimeter = (a + b +c) / 2

#三角形面积
square = (semi_perimeter * (semi_perimeter - a) * (semi_perimeter - b) * (semi_perimeter - c))**0.5
print("三角形的面积为： ", square)