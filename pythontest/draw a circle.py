def getTriangleArea(a, b, c): # 计算半周长 s = (a + b + c) / 2 # 计算面积 area = (s*(s-a)(s-b)(s-c)) ** 0.5 # 返回结果 return area
s = (a + b + c) / 2
area = (s*(s-a)(s-b)(s-c)) ** 0.5
return area
#输入三边长度
a1 = float(input("输入边长a："))
b2 = float(input("输入边长b："))
c3 = float(input("输入边长c："))

#调用函数计算三角形面积
area = getTriangleArea(a1, b2, c3)

#输出结果
print("三角形面积为：%!f(MISSING)" %!a(MISSING)rea)