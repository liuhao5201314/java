public class Sanyuanyunsuan{
	public static void main(String[] args){
		//三元运算符
		//条件表达式？表达式1：表达式2；
		//如果表达式为真，运算结果为1
		//如果条件表达式为假，运算结果为2
		int a=10;
		int b=99;
		int result=a>b?a++:b--;//result 先赋值再减减result=99
		System.out.println("a="+a+"b="+b);

		//三元运算细节
		//表达式1和2要为可以赋给接收变量的类型
		int i=3;
		int j=4;
		double c=i>j?1.1:1.2;//这样是不可以的要用double
	}
}

class Homework{
	public static void main(String[] args){
		int a=10;
		int b=23;
		int c=5;
		int max1=a>b?a:b;
		int max2=max1>c?max1:c;

		int max2=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("最大值"+max2);
	}
}
//