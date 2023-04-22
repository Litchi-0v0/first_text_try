package studentManage;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	private static final String Num = null;

	// 定义公开的类，类名为:TestMain
	public static void main(String[] args) { // 主函数，Java从此开始进入运行，创建一个静态的公开的主方法
		// ArrayList<参数化类型> list = new ArrayList<参数化类型>(); 哈希表
		// 泛型ArrayList<Student>，ArrayList集合中只允许存储Student类型的数据

		// 创建ArrayList集合，存储student对象
		ArrayList<Student> array = new ArrayList<Student>();

		while (true) {
			// 页面创建
			System.out.println("---------------------学生管理系统-------------------");
			System.out.println("          1：添加学生信息       2：删除学生信息");
			System.out.println("          3：更改学生信息       4：查询学生信息");
			System.out.println("          5：退出管理系统                           ");
			System.out.println("---------------------------------------------------");
			System.out.println("请选择系统功能: ");

			// 输入管理系统选项
			Scanner sc = new Scanner(System.in);// 常用的字符串输入操作，以“SC”作为引用名
			String choice = sc.nextLine();
			/*
			 * 实例化对象的方法： new 类名 （）；
			 * new 是 java 中的运算符
			 * new 作用：创建对象，在JVM堆内存中开辟新空间
			 * JVM的栈内存：方法代码片段执行时，会在栈内存中压栈
			 */
			switch (choice) { // 用法基本同c语言中的switch-case语句
				case "1":
					addStudent(array); // 增
					break;
				case "2":
					removeStudent(array); // 删
					break;
				case "3":
					updateStudent(array); // 改
					break;
				case "4":
					findStudent(array); // 查
					break;
				case "5": // 退出

				default:
					System.out.println("谢谢您的使用");
					System.exit(0);// 退出java程序
			}
		}
	}

	// 1.添加学生信息
	public static void addStudent(ArrayList<Student> array) { // 公开的静态的添加学生的普通方法
		Scanner sc = new Scanner(System.in);

		String Num;
		System.out.println("请输入学生学号：");
		Num = sc.nextLine(); // 输入学号Num，nextLine返回string类型
		if (true) {
			System.out.println("请输入学生姓名：");
			String Name = sc.nextLine();// 输入字符串用nextLine
			System.out.println("请输入学生住址：");
			String Add = sc.nextLine();
			System.out.println("请输入学生性别：");
			String Sex = sc.nextLine();
			System.out.println("请输入学生年龄：");
			int Age = sc.nextInt();// 输入整型数用nextInt
			System.out.println("请输入学生电话：");
			int Tel = sc.nextInt();

			// 创建学生对象,构造应用变量s
			Student s = new Student(Num, Name, Add, Tel, Sex, Age); // 一个新的类（student类），s作为引用变量，student类位于Student.java的文件中
			s.setSNo(Num);// 普通方法的调用，传入实参Num,后续几行代码原理一致
			s.setName(Name);
			s.setAdd(Add);
			s.setSex(Sex);
			s.setAge(Age);
			s.setTel(Tel);
			array.add(s);// 把学生对象作为元素添加到集合1
			System.out.println("添加成功!");
		}
	}

	// 2.删除学生信息
	public static void removeStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除的学生的学号: ");
		String No = sc.nextLine(); // 键盘录入的学号返回给No

		// 作为索引
		int index = -1;
		// 遍历学生信息
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			// 获取该学生的学号，和键盘录入的学号进行比较
			if (s.getNo().equals(No)) {
				index = i; // 学生信息存在的话，修改索引的值
				break;
			}
			// public boolean equals(Object obj) {
			// return (this == obj);
			// }equal的用法
		}

		if (index == -1) {
			System.out.println("您要删除的学生信息不存在，请重新选择: ");
		} else {
			array.remove(index); // 删除获取的学生信息
			System.out.println("删除学生信息成功");

		}
	}

	// 3.修改学生信息
	public static void updateStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改的学生的学号: ");
		String No = sc.nextLine();

		// 作为索引
		int index = -1;
		// 遍历学生信息
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			// 获取该学生的学号，和键盘录入的学号进行比较
			if (s.getNo().equals(No)) {
				index = i;// 同上
				break;
			}
		}
		if (index == -1) {
			System.out.println("您要修改的学生信息不存在，请您重新选择: ");
		} else { // index = i;的时候
			// 注意：修改学生信息的时候，学生学号不会发生改变
			System.out.println("请输入学生新姓名：");
			String Name = sc.nextLine();

			System.out.println("请输入学生性别：");
			String Sex = sc.nextLine();

			System.out.println("请输入学生新住址：");
			String Add = sc.nextLine();

			System.out.println("请输入学生年龄：");
			int Age = sc.nextInt();

			System.out.println("请输入学生电话：");
			int Tel = sc.nextInt();
			// 创建学生对象
			Student s = new Student(Num, Name, Add, Tel, Sex, Age); // 一个新的类（student类），s作为引用变量，student类位于Student.java的文件中
			// 学生对象s不调用set方法，则修改后的值为null
			s.setSNo(Num);
			s.setName(Name);
			s.setSex(Sex);
			s.setAge(Age);
			s.setTel(Tel);
			s.setAdd(Add);
			// 修改学生中的集合对象
			// Arraylist集合中set方法，set(int index,Object o)覆盖元素。
			array.set(index, s);

			System.out.println("修改学生信息成功!!");
		}
	}

	// 4.查询学生信息
	public static void findStudent(ArrayList<Student> array) {
		// 判断学生信息集合的长度，如果等于0，学生信息为空，程序结束
		if (array.size() == 0) {
			System.out.println("对不起，当前学生信息为空，请您重新选择: ");
			return;// 不让程序往下执行
		}
		// 学生信息列表
		System.out.println("学号\t\t姓名\t\t性别\t\t年龄\t\t住址\t\t电话");// \t是一个tab键的位置,怕数据太长，来两个\t吧
		// 遍历集合
		for (int i = 0; i < array.size(); i++) {
			Student student = array.get(i);//
			System.out.println(
					student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge()
							+ "\t\t" + student.getAdd() + "\t\t" + student.getTel());
		}
	}
}
