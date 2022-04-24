//变量(名称+值+类型)
//必须先声明后使用
//变量的值可以改变但必须在同一类型下进行改变
//变量在同一个作用域()不能同名
//
class Bianliang{
	public static void main(String []args){
		int a=1;//分配一个空间叫做a，定义整型变量值为1
		int b=3;
		b=89;//进行赋值，89赋值给b
		System.out.println(a);//进行输出a的值
		System.out.println(b);
	}
}
//把变量看作存储空间的门牌号，通过门牌号找到变量值
class Bianliang2{
	public static void main(String []args){
		int a;
		a=100;
		System.out.println(a);
	}
}
//int double char String（字符串）
//记录人的信息
class Bianliang3{
	public static void main(String []args){
		int age = 22;
		double score = 90.8;
		char gender = '男';
		String name = "刘浩";
		System.out.println("基本信息");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(score);
	}
}