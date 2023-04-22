import this
print("Hellow,world")

#python约定文件名用小写字母+下划线，eg:simple_message.py
#用引号引起的都是字符串
#a = "Hellow"
#b = "WORLD"
#print(a + b)
#运行结果：HellowWORLD
#print("Hellow" + "WORLD")
#运行结果：HellowWORLD

#：列表[]
#Python中用([])来表示列表，用逗号分隔其中的元素
#请求获取字符串时，只返回对应元素
#索引-1，指倒数第一个元素

# 元组()
# 不可修改值的列表,所以遍历方式同列表
#定义元组：使用圆括号
#修改元组的值要整体修改：
#dimensions = (10,20)
#dimensiond = (100,200)   

#字典{}(默认自带两个参数)
#键-值队组成
# flower = {
#          'name':'rose',
#          'color':'red',
#          'life' :'10',
#          'energy' : 5,
#          }
# flower['color'] = 'green'#修改值
# flower['people'] = [10]#增添值
# del flower['people'] #永久性删除值
# print(flower['name'])#由键找值，访问值
# print(flower)#全部键值队于{}中输出
##遍历字典(输出所有键值队)
# for key, value in flower.items():
#     print(key, value)
#     print('\n')
#遍历字典的键（输出所有键）
# for key in flower.keys():
#     print(key)
#按顺序遍历字典的键(按顺序输出所有的键)
# for key in sorted(flower.keys()):
#     print(key)
#遍历字典的值（输出所有值）
# for value in flower.values():
#     print(value)

#集合
# 创建一个集合
#s = {1, 2, 3}
# 或者
# s = set([2, 3, 3, 1])
# print(s)
# 输出：{1, 2, 3}体现有序性，独一无二性
# 添加元素
# s1.add(4)
# # 删除元素
# s2.remove(4)
# # 求并集
# s3 = s1.union(s2)
# # 求交集
# s4 = s1.intersection(s2)
# # 求差集
# s5 = s1.difference(s2)

#可以在字典中放列表，在列表中放列表，在列表中放字典......

##Python操作大集合！！！！！！！！！！！！
## 1：合并字符串
#  a_name = "aaaa"
#  b_name = "bbb"
#  c_name = a + " " + b
## 2：乘方运算：**
#  a**b:a的b次幂
## 3：切片：
#lst = ['apple', 'banana', 'cat', 'apple', 'dog', 'car']
# lst[num1 : num2]
# 切片位置：下标从num1到（num2 - 1）
#num一个为负数，另一个不可为正数或0
#lst[-3:]  :  表示取倒数三个元素
#切片也是列表，复制与遍历效果同普通列表
#in和not in在与不在
## 4：用while处理列表或字典，实现元素的移动，删除指定元素:
## 5:用户输入填充字典：
# words = {}#Get a empty dictionary
# boolTest = True;#Set a judge
# while boolTest:
#     word = input('\nword:')
#     meaning = input('\nmeaning:')
#     words[word] = meaning#The important sentence!!!dictionaryName[jian] = zhi
#     judje = input('\nWould you like to continue?Yes or No:')
#     if judje == 'No':
#         boolTest = False
# print(words)
    


# Python方法大集合！！！！！！！！！！！！(使用方法基本都是：变量名 + '.' + ())
## 1：单词首字母小写转大写：title()
#  name = "ada"
#  print(name.title())
## 2：字符串全变大写：upper()
#  name = "ada"
#  print(name.upper())
## 3：字符串全变小写:lower()
#  name = "ada"
#  print(name.lower())
## 4：剔除字符串开头(左端)空格：lstrip()
## 5：剔除字符串结尾(右端)空格：rstrip()
## 6：剔除字符串两头空格：strip()
## 7：将非字符串值表示为字符串：str()
#  age = 27
#  print("Happy " + str(age) + "rd Birthday!")
## 8：列表尾添加元素：数组名.append(元素)
## 9：列表中插入元素：数组名.insert(下标.前插元素)
## 10：知道下标，删除列表元素：del list[]
## 11：删除尾部值并返回该值：a = 数组名.pop()
## 12：知道下标，删除并返回该值：a = 数组名.pop(下标)
## 13：知道元素，不知道下标，删除并返回该值：a = 数组名.remove(元素)
##################attention:若不清楚删除的元素是否在列表中还要删除，用while循环，用remove会报错
#eg:lsts = ['apple', 'banana', 'cat', 'apple', 'dog', 'car']
#while 'bane' in lsts:
#   lsts.remove('bane')
## 14：永久性排序：list.sort()
## 15：永久性反向排序：list.sort(reverse=True)
## 16：临时排序：sorted(list)
## 17：临时反向排序：sorted(list,reverse=True)
## 18：列表反向：list.reverse()
## 19：列表长度：len(list)
## 20：顺次从num1到（num2 - 1）：range(num1, num2)
#  以下介绍列表的两种遍历方式：
# lst = ['apple', 'banana', 'cat', 'apple', 'dog', 'car']
# for i in range(0 , len(lst)):
#     print(lst[i])
# for a in lst : 
#     print(a)
## Attention points:a = list(a,b,c,d,e,f,g,h)表示将括号中的值变为列表
## 21：生成等差数列：a = list(range(num1, num2,num3)) 
#  表示：从num1到num2 - 1，公差为num3
## 22：可用min(list);max(list);sum(list);
## 23：生成等比数列:a = [i**2 for i in range(1, 11)],生成1,9,16,25,36,49,64,81,100
## 24：确定列表不是空的：if list:
## 25:input(展示给客户的内容):用户输入的内容一律用字符串表示
