package studentManage;

public class Student { // 定义一个公开的学生类
	// 定义变量学号、姓名、住址
	private String Num;
	private String name;
	private String add;
	private String sex;
	private int tel;
	private int age;

	public Student(String num, String name, String sex, int age, String add, int tel) { // 一个公开的函数方法，名为Student
		this.Num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.add = add;
		this.tel = tel;
		// this关键词，用来调用被private限制的变量
	}

	// 学号
	public void setSNo(String num) {// 接收来自TestMain.java中用户输入进的实参
		this.Num = num; // 改变或存储学号的值，以下同理
	}

	public String getNo() {// 接收来自TestMain.java传来的调用方法的指令，以下同理
		return Num;
	}

	// 姓名
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 性别
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	// 年龄
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	// 住址
	public void setAdd(String add) {
		this.add = add;
	}

	public String getAdd() {
		return add;
	}

	// 电话
	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getTel() {
		return tel;
	}

}
