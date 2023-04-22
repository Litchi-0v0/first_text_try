public class Hellow /* 一个公开的类，类名为Hellow */
// 类体
{ /* public：公开的 class：类 Hellow：一个类名 */
  // 主方法 /*main:方法名 */
  public static void main(String[] args) {
    System.out.println("Hello,world!"); /* static:静态的 void：空 main：方法名：main (String[] args)：一个main方法的形式参数列表 */
    // 方法体，Java语句， /*args：变量名 */
  }
}

// 需要熟练输入的内容：
// class MyData{
// int day;
// int month;
// int year;
// MyData a,b;
// a = new Date();
// b = new Date();
// a.day = 10;
// b.day = 10;
// a.month = 1;
// b.month = 1;
// System.out.println("a.day = " + a.day);
// }

/*
 * java关键字、方法合集
 * 1：求数组长度：list.length
 * 2：数组的复制：
 * copyOf函数的应用:
 * int a[] = {1,2,3,4,5};
 * int b[] = Arrays.copyOf(a,number)复制a数组前number个元素
 * Arrays.copyOfRange(a, num1,num2)
 * 复制从a[num1]到a[num2 - 1] 这num2-num1个值
 * 3：快速排序：Arrays.sort(list);
 * 4：二分查找：注意：数组必须已经排好序，该方法有返回值
 * Arrays.sort(list);
 * int t = Arrays.binarySearch(list,number);
 * 若存在，返回从1开始的下标，若不存在，返回一个负数
 */

/*
 * Java的加载与执行：
 * 
 * java ->class生成.A .B .C....类型文件 ->类装载器-> 去找class文件 ->操作系统生成0101010文件 ->
 * 与硬件平台进行交互
 * 
 * JDK ：开发工具包 -> 包含 JRE：运行环境 -> 包含 JVM：运行的Java虚拟机
 */

/**
 * 标识符的命名规范：
 * 最好见名知意
 * eg:
 * public class UserService{
 * public void login{String username,String password} 就知道是建立一个用户信息
 * }
 */

// 各种关键词：
// public
// class
// static
// main
// System.out.println

// public class后的类必须和原文件名字一致
// 每一个class都可以编写主方法

/*
 * 字面值：（数据类型)
 * 17 85 95 ： 整数型字面值
 * 3.14 5.28 ： 浮点型字面值
 * "China" "CLASSSS" "A" "我爱你鸭" ： 字符串型字面值
 * 'A' '人' ： 字符型字面值
 * true false : 布尔型字面值
 */

/* int i = 100; i = 200 ...................重新赋值 */
/* int i = 100; int i = 200 ............... 不是重新赋值 */

/**
 * 数据类型（四大类八小种）： 字符串不属于基本数据类型
 * 1：整数型 byte short int long
 * 2：浮点型 float double
 * 3：布尔型 boolean
 * 4：字符型 char
 */

/**
 * -------------------------------------
 * 基本数据类型 占用空间大小
 * byte 1 最大值：127 最小值：-128
 * short 2
 * int 4
 * long 8
 * float 4
 * double 8
 * boolean 1 true and flase
 * char 2 用二进制表示不了，通过 数字编码 表示文字 eg:ASCll码 一个中文占用2个字节，即一个char
 * char不可以装字符串，可以装一个汉字 除非是 "/n"
 */

// long常量结尾以L结尾，float常量结尾以f或F结尾

// 高级别值赋给低级别值必须做强制类型转化

// 八进制以“0”开头，十六进制以“0x”开头

// 类型转换：小可自动转大，大不可转小（除非整数类型没有超过byte最大值127，可以直接自动大转小 byte = 50;

// println:换行输出 print: 非换行输出

// String:不能修改的字符串，定义：String a = "Hello";
// StringBuilder:可修改的字符串，定义：StringBuilder b = "Hello";
// '+'号可以拼接两个String，eg:
/*
 * String a = "Hello, world ";
 * String b = "Hello, world";
 * String c = a + "Hello, world" +b;
 * System.out.println(c);
 * 输出Hello, world Hello, worldHello, world
 */

/*
 * 简单的面向对象，定义类：
 * class MyData{
 * int day;
 * int month;
 * int year;
 * }
 * 定义了MyDate后，对于一个日期，只需要声明变量即可，eg:
 * MyDate a, b;
 * a.day = 1; b.day = 2;
 * a.month = 1; b.month =2;
 * a.year = 1; b.year = 3;
 * 注意：使用时还要给a,b分配空间！！！！！
 */

/* a.equals(b)：判断两个字符串a,b是否相等 */

/*
 * 数组名.length表示数组长度
 * int a[] = {1, 2, 3, 4, 5, 6};
 * System.out.println(a.length);
 * 对于二维数组，求其中一个一维数组的长度，可用：
 * 数组名[2].length 表示要求该二维数组第二行的长度
 */

/*
 * 数组名.charAt(i)作用：
 * String a = "Hello, World"
 * System.out.println(a.charAt(2));
 * 字符串.charAt(2)表示要求该二维数组第二行的某个元素
 * ()内的范围从0到 length - 1
 */

/*
 * nwe基本类型数组的创建：
 * int[] array = new int[10];
 * int array[][] = new int[10];
 * 此时 System.out.println(array[i]);，结果为十个0；
 * 使b数组和a数组一样：a = b
 * int list[] = {123, 456, 789} ;
 * System.out.println(list);
 * 输出结果：I@372f7a8d，叫做a的引用，对于char类型数组会依次输出各个元素
 * 。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。查
 * 对象类型和对象实例
 * 假设你要创建一个汽车的对象类型。你希望这个类型叫做 car，这个类型具备 make， model， year 等属性，要做到这些，你需要写这样一个函数：
 * 
 * function Car(make, model, year) {
 * this.make = make;
 * this.model = model;
 * this.year = year;
 * }
 * 
 * 现在，你可以如下所示创建一个 的对象：mycar
 * 
 * var mycar = new Car("Eagle", "Talon TSi", 1993);
 * 
 * 这段代码创建了 并给他的属性指定值，于是 的值为""， 的值为 1993，以此类推。mycarmycar.makeEaglemycar.year
 * 
 * 你可以通过调用 来创建任意个汽车对象。例如：new
 * 
 * var kenscar = new Car("Nissan", "300ZX", 1992);
 * 
 * 对象属性为其他对象
 * 假设你定义了一个对象叫做 ：person
 * 
 * function Person(name, age, sex) {
 * this.name = name;
 * this.age = age;
 * this.sex = sex;
 * }
 * 
 * 然后实例化两个新的 对象如下：person
 * 
 * var rand = new Person("Rand McNally", 33, "M");
 * var ken = new Person("Ken Jones", 39, "M");
 * 
 * 然后你可以重写 的定义，添加一个值为 对象的 属性，如下：carpersonowner
 * 
 * function Car(make, model, year, owner) {
 * this.make = make;
 * this.model = model;
 * this.year = year;
 * this.owner = owner;
 * }
 * 
 * 为了实例化新的对象，你可以用如下代码：
 * 
 * var car1 = new Car("Eagle", "Talon TSi", 1993, rand);
 * var car2 = new Car("Nissan", "300ZX", 1992, ken);
 * 。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。查
 */

/*
 * new对象数组的创建
 * Point p[];
 * P = new Point[10]; // 其包含10个Point类型对象引用的数组 或者就直接：Point p[10];
 * for(int i = 0; i < 10; i++){ // 创建十个Point对象，图见数69面
 * p[i] = new Point(i, i+1);
 * }
 */

// public class ttt {
// public static void main(String[] args){
// String[] p = new String[2]; //核心创建代码 int [] a = new int[2]; double[] d = new
// double[2];读作：什么类型的数组=
// p[0] = "Hello";
// p[1] = "World";
// System.out.println(p[0].toLowerCase());
// System.out.println(p[1].toUpperCase());
// }
// }
// 结果：hello WORLD

/*
 * for循环还可以这样用！！！
 * int[] numbers = {1,2,3,4,5,6,7,8};
 * for(int element : numbers){ 意思是：for each element in numbers do {...}
 * System.out.println(element);
 */

/*
 * 数组的复制
 * int[] numbers = {1,2,3,4,5,6,7,8};
 * int[] copynumbers = new int[5];
 * System.arraycopy(numbers, 2, copynumbers, 0, 5);
 * 从numbers[2]开始复制到copynumbers中的从copynumbers[0]到copynumbers[4]
 * for(int i = 0; i < copynumbers.length; i++)
 * System.out.println(copynumbers[i]);
 */

/*
 * Java实现让用户输入数据： Attention:前面必须有一句：import java.util.Scanner; !!!!!!!!!!!!!
 * import java.util.Scanner;
 * 
 * public class InputExample {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in); //创建Scanner对象
 * System.out.print("请输入数字：");
 * int num = scanner.nextInt(); //从键盘获取整数
 * System.out.println("您输入的数字是：" + num);
 * scanner.close(); //关闭Scanner对象
 * }
 * }
 * 数据类型 变量 = scanner.next数据类型();首字母大写
 */

/*
 * Scanner的方法
 * next(）//返回String
 * nextLine()// 返回String
 * nextInt()//
 * nextDouble()//
 * nextFloat()//
 * nextLong()//
 * nextShort()//
 * nextByte()//
 * nextBoolean()//
 */

/*
 * 每输出几个就换行：需要引入计数器：eg:count //每输出8个换行
 * if (true) {
 * System.out.println(" ");
 * count ++;
 * if (count == 8){
 * System.out.println(" ");
 * count = 0;
 * }
 * }
 */

/**
 * 方法（函数）：
 * 定义：语法结构为：
 * [修饰符列表] 返回值类型 方法名（形式参数列表）{ 即：public static int intSum(int x, int y) {
 * 方法体； }
 * }
 * [修饰符列表]：public static public :公开的 static ：静态的
 * 返回值类型(必须要有)： int double char boolean void
 * 方法名：见名知意，驼峰式命名，合法就行
 * 形式参数列表：之间用‘，’隔开，如：int a, double b, float c, String d, ...
 * 尤其注意形参的数据类型，形参的名字就是局部变量的名字
 * 调用方法时，将实参传入，实参与形参必须满足一一对应
 * 方法体：自上而下执行的Java语句
 * 方法体调用方法：
 * 类名。方法名（实参列表）
 * 
 * eg:
 * public class Hellow{
 * //类体，类体中不直接编写语句，除变量声明，方法体出现在类中
 * public static void main(String[] args){ //此句为官方规定的程序入口
 * int he = sum(10 ,20); //调用 Hellow类体 中的函数 完整形式：int he = Hellow.sum(he);
 * System.out.println(he);
 * int h = another.sum(10 ,20); //注意：调用的是 another类体 中的函数 调用时，用： 类名。方法名
 * System.out.println(h);
 * }
 * public static int sum(int x, int y) {
 * return x + y; }
 * 
 * class another
 * {
 * public static int sum(int a, int b) {
 * return a + b;
 * }}} 结果：30 30
 * 方法在调用时，会给方法分配内存空间，会发生压栈动作 方法执行结束后，会释放所分配的空间，发生弹栈动作
 * Java程序，从主方法开始（入栈），也是主方法最后一个（出栈）。
 */

/*
 * 用if语句返回时，if和else中都要有return；
 * eg:
 * if (a > 3)
 * return 1;
 * else
 * return 0; //哪怕已知a = 10;
 * 上述句也可以转化为：a > 3 ? return 1 : return 0 ;
 */

/*
 * 方法重载： （调用方法时，会根据数据类型选择方法进行调用） 方法重载只与方法名+参数类型相关，其他无关
 * 核心 ： 方法一样，但参数类型不一样 要求：在同一个类中；方法名相同；参数列表不同（数量、顺序、类型不同）
 * public class Overloaded{
 * public static void main(String[] args){
 * System.out.println(sum(1, 2)); 自动选择1号sum方法，无需再写不同的方法名
 * System.out.println(sum(1.0, 2.0)); 自动选择2号sum方法，无需再写不同的方法名
 * System.out.println(sum(1L, 2L)); 自动选择3号sum方法，无需再写不同的方法名
 * }
 * public static int sum(int x, int y){ 1号方法
 * System.out.println("sum(int, int)");
 * return x + y;
 * }
 * public static double sum(double x, double y){ 2号方法
 * System.out.println("sum(double, double)");
 * return x + y;
 * }
 * public static long sum(long x, long y){ 3号方法
 * System.out.println("sum(long, long)");
 * return x + y;
 * }
 * }
 * 结果：
 * sum(int, int)
 * 3
 * sum(double, double)
 * 3.0
 * sum(long, long)
 * 3
 */

/*
 * 递归 求1*2*3*4*5*...*n
 * import java.util.Scanner;
 * 
 * public class Overloaded{
 * public static void main(String[] args){
 * Scanner scanner = new Scanner(System.in);
 * int num = scanner.nextInt();
 * int sum = multiply(num);
 * System.out.println("sum: " + sum);
 * 
 * }
 * public static int multiply(int a){
 * if (a == 1) return 1;
 * else{
 * return a*multiply(a-1) ;}}}
 */

/*
 * JAVA面向对象 三大特征：封装、继承、多态
 * 什么是类？ Answer:类是人抽象出的结果。 代表一类有相同特征的事物，被人进行抽象定义而产生的一个模板
 * 什么的对象？ Answer:实际存在的个体，又被称为实例
 * 软件开发过程：
 * *先观察世界，从现实世界中寻找对象
 * *发现所以对象的共同特征
 * *人为抽象出一个模板类
 * *用Java定义类，创建对象，形成系统
 */

/*
 * Java 中包含两种数据类型：
 * 基本数据类型：int long double float char boolean short string...
 * 引用数据类型：
 * string.class SUN定义的
 * System.class SUN定义的
 * 
 * Student.class 程序员自己定义的
 * User.class 程序员自己定义的
 * Product.class 程序员自己定义的
 * Java中所有的class都是引用数据类型
 */

// 应用举例：项目式面向对象创建学生的信息：（两个文件，一个为astudent文件，一个为OOtext文件）

/*
 * astudent File:
 * 
 * //学生类型，引用数据类型
 * public class astudent {//定义类名：Student
 * //类体 = 属性 + 方法
 * 
 * //【属性】，描述学生的状态信息，属性通常由变量定义，“成员变量”于类体中方法体之外定义，没有赋值，向0看齐，由系统赋值
 * //创建对象： （只有创建了对象，才有空间，才能通过对象去访问）
 * String number; //学号
 * 
 * String name; //姓名
 * int age; //年龄
 * String sex; //性别
 * int height; //身高
 * int weight; //体重
 * String birthday; //生日
 * }
 * 
 * 实例化对象的方法： new 类名 （）；
 * new 是 java 中的运算符
 * new 作用：创建对象，在JVM堆内存中开辟新空间
 * JVM的栈内存：方法代码片段执行时，会在栈内存中压栈
 * 
 * OOtext File:
 * public class OOtext {
 * public static void main(String[] args) {
 * int i = 10; //i的值在栈内存中
 * astudent s = new astudent(); //new
 * 在堆内存中开辟了空间称之为对象，该对象可在astudent中看，有number,name,birthday......
 * //astudent 是引用数据类型 s 是变量名，new astudent() 是一个学生对象
 * 
 * //开始引用：
 * //语法格式： 读取数据： 引用.变量名
 * // 修改数据： 引用.变量名 = 值
 * //在这一个文件中先统一astudent文件中数据的格式 这些量都在堆内存中，s是用new创建的
 * String stuNnmber = s.number; //看astudent文件中number对应的类型是什么
 * String stuName = s.name;
 * int stuAge = s.age;
 * String stuSex = s.sex;
 * int stuHeight = s.height;
 * int Weight = s.weight;
 * String Birthday = s.birthday;
 * 
 * //开始赋值： java赋值要从栈内存中引用统一指代变量s，通向堆内存中的变量名，再进行赋值： s. :引用的意思 number
 * ，name等值都在堆内存中
 * s.number = "22408060104";
 * s.name = "Li";
 * s.age = 19;
 * s.sex = "male";
 * s.height = 175;
 * s.weight = 75;
 * s.birthday = "February";
 * 
 * //输出修改后的结果
 * System.out.println("s.number: " + s.number);
 * System.out.println("s.name: " + s.name);
 * System.out.println("s.age: " + s.age);
 * System.out.println("s.sex: " + s.sex);
 * System.out.println("s.height: " + s.height);
 * System.out.println("s.weight: " + s.weight);
 * System.out.println("s.birthday: " + s.birthday);
 * 
 * //再创建一个新的学生，还使用astudent中的特征，可以再次用new，换一个代指变量，通向堆内存中的新空间（为这位新学生开辟新的空间）
 * astudent t = new astudent();
 * t.number = "22408060104"; //这里的t,s都是实例变量
 * t.name = "Li";
 * t.age = 19;
 * t.sex = "male";
 * t.height = 175;
 * t.weight = 75;
 * t.birthday = "February";
 * 
 * //总结：局部变量在栈内存中储存
 * //成员变量中的实例变量在堆内存的Java中储存
 * //t,s都是实例变量，实例变量一个，对应一份对象
 * }
 * }
 */
/*
 * 堆内存中还可以通过new语句再次创建新的堆内存空间 （引用“：引用是一个变量，变量包括：局部变量和成员变量）
 * eg:
 * public class User{
 * int id;
 * String name;
 * Address addr; //其中Address为引用数据类型
 * }
 * public class Address{
 * String city =
 * String sette =
 * }
 * public static void main（String[] args）{
 * User u = new User(); 调用public class User 中定义的值 引用
 * u.id =
 * u.name =
 * 
 * u.addr = new Address(); 调用public class Address 中定义的值 双重引用
 * u.addr.city = //翻译为：User中的Address中的city
 * u.addr.sette =
 * }
 */

/*
 * 类型中的属性就可以点儿（.）
 */

/*
 * 封装：（本质：安全，可重复使用
 * 看不到事物复杂的那一面，只看到简单的那一面。内部实现非常复杂，使用者使用非常方便
 * 封装后形成真正的对象，独立体
 * 提高事物本身安全性
 */

/*
 * 封装步骤：
 * 1：所有属性私有化，用private关键词修饰的数据只能在本类中访问 eg: private int a = 1;
 * 问题：此类以外直接访问不了了！！！第二步解决该太安全的问题
 * 2：对外提供简单的访问入口，方式：读取该值：用get .......... 修改该值；用set
 * set 方法访问规范： (set函数没有返回值)
 * public class ???{
 * private int num ;
 * public void setNum (int a){
 * num = a;
 * }}
 * 此后，可以在其他类中写：number n = new number();
 * n.setNum(10000);
 * 
 * get 方法访问规范：
 * public class ???{
 * private int num ;
 * public int getNum(){
 * return num;
 * }
 * 此后，可以在其他类中写：number n = new number();
 * System.out.println(n.getNum());
 */

/*
 * java类中构造函数的方法：
 * 1：语句结构：
 * [修饰符列表] 构造方法名 (形参列表){
 * 构造方法体
 * }
 * 2：对于构造来说，“返回值类型”返回值类型不需要指定，并且也不能写void,写了void就成普通方法了
 * 3：构造方法名需要和类名一致！！！
 * 4：先对比一下：
 * 普通方法调用方式：方法修饰符中有static时，：类名.方法名(实参列表)//没有static的时候：引用.方法名(实参列表)
 * 构造方法的调用：new 构造方法名(实参列表)
 */

/*
 * 方法与函数总结：
 * 1：有static的普通方法，注意是普通方法！！！
 * 调用：类名.方法名（实参）
 * 方法格式：[修饰符列表] 返回值类型 方法名 (形参列表){}
 * eg: main里负责调用：类名.ooooo(i , j);
 * main外写方法体：public static int oooooo(int i, int j) {return ; }
 * 
 * 2:无static的普通方法，注意是普通方法！！！
 * 调用：类名 引用变量 = new 类名();
 * 引用变量.方法名(实参列表)。。。注意：要用new!!!!
 * 方法格式：public 返回类型 方法名(形参列表){}
 * eg:先要明确在哪个类里需要调用该普通方法，再用new；假设在bbbb.java文件中即在bbbb类中需要调用方法
 * main里负责调用：bbbb h = new bbbb();
 * h.doSomething() ; //引用.方法名()
 * main外写方法体：public void doSomething() {}
 * 
 * 3：函数的调用，在两个文件中实现
 * eg:在bbbb.java文件的main函数中：Users oo = new Users();//类名 引用变量名 =
 * new类名（）；也是：函数名.引用变量 = new 函数名();
 * 在User.java文件中写方法（函数）体：
 * public class Users
 * {
 * public Users(){//注意：函数名同类名一致
 * System.out.println("hahahahahaha");}
 * }
 */

/*
在Java中，class A 和 public class A 都是指同一个类，但是它们的访问修饰符不同。
class A 是一个私有类，它不能被外部直接访问，只能通过类的实例来访问。
public class A 是一个公共类，它可以被外部直接访问，并且可以包含私有成员变量和方法。
因此，class A 和 public class A 的区别在于它们的访问修饰符不同。
 */

/*
 * this关键词
 * 在静态方法中无法直接使用“this”关键词，实例方法中可用
 * this 是应用、变量，保存在Java堆内存中
 * 1：引用该对象的成员变量
 * 在类中定义的成员变量（包括静态和非静态）与方法的参数名相同时，使用this来明确成员变量。
 * public class MyClass {
 * private int num;
 * 
 * public void setNum(int num) {
 * this.num = num; // 使用this来指定成员变量num
 * }
 * }
 * 2：引用该对象的构造函数
 * Java中的构造函数可以使用this()调用同一类的另一个构造函数。用法类似于方法的重载。
 * public class MyClass {
 * private int num;
 * 
 * public MyClass() {
 * this(0); // 调用有参构造函数
 * }
 * 
 * public MyClass(int num) {
 * this.num = num;
 * }
 * }
 * 
 * 3：返回该对象的引用
 * 在方法中返回当前对象的引用，通常在链式编程中使用。
 * public class MyClass {
 * private int num;
 * 
 * public MyClass setNum(int num) {
 * this.num = num;
 * return this; // 返回当前MyClass对象的引用
 * }
 * }
 * 
 * 4：传递该对象的引用
 * 将该对象的引用作为参数传递给其他方法或构造函数。
 * public class MyClass {
 * private OtherClass other;
 * 
 * public MyClass(OtherClass other) {
 * this.other = other; // 将OtherClass对象的引用赋值给MyClass对象的成员变量
 * }
 * 
 * public void doSomething() {
 * other.someMethod(this); // 传递当前MyClass对象的引用
 * }
 * }
 */

/*
 * static的用法
 * 在Java中，static是一个关键字，可以用来修饰变量、方法和代码块。它的主要作用是创建类级别的变量和方法，并在没有创建对象实例的情况下访问它们。
 * 具体用法如下：
 * 
 * 1：静态变量
 * 静态变量属于类，而不是属于类的某个对象。因此，它可以在没有创建任何对象实例的情况下直接访问。
 * public class MyClass {
 * public static int num; // 声明一个静态变量
 * 
 * public static void main(String[] args) {
 * // 直接通过类名来访问静态变量
 * MyClass.num = 10;
 * }
 * }
 * 
 * 2：静态方法
 * 静态方法也是属于类的，它可以在没有创建任何对象实例的情况下直接调用。与静态变量一样，静态方法也不能直接访问非静态成员变量和非静态成员方法。
 * public class MyClass {
 * public static int add(int a, int b) { // 声明一个静态方法
 * return a + b;
 * }
 * 
 * public static void main(String[] args) {
 * // 直接通过类名来调用静态方法
 * int result = MyClass.add(3, 5); // result的值为8
 * }
 * }
 * 
 * 3：静态代码块
 * 静态代码块使用static关键字来修饰，它主要用于在类被加载时执行一些初始化操作。
 * public class MyClass {
 * public static int num;
 * 
 * static { // 声明一个静态代码块
 * num = 10;
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println(num); // 输出结果为10
 * }
 * }
 * 需要注意的是，由于静态成员属于类，而不是属于某个对象实例，因此建议使用类名来访问静态成员，而不是通过对象实例来访问。
 */

/*
 * 继承
 * 1：基本作用：代码的重复使用，有了继承才有以后"方法的覆盖"和”多态机制“
 * 2：继承的语法格式：
 * [修饰符列表] class 类名 extends 父类名{
 * 类体 = 属性 + 方法
 * }
 * 3：java中只支持单继承，一个类不能同时继承很多类，只能继承一个类
 * 4：继承术语：
 * B类继承A类，其中：
 * A类称为：父类、基类、超类、superclass
 * B类称为:子类、派生类、subclass
 * 5:子类继承父类的数据：
 * 私有的不支持继承、构造方法不支持继承，其余的数据都可继承
 * 6：虽然单继承，但一个类可间接继承其他类:
 * C extends B{
 * }
 * B extends A{
 * }
 * A extends T{
 * }
 * C直接继承B类，间接继承T、A、类
 * 7:java始终会继承JDK中的始祖类
 */