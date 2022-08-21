import java.util.Scanner;
import java.util.Arrays;
public class leiandduixiang{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入小猫名称");
		String name = input.next();//输出字符串
		if(name.equals("小白")){
			System.out.println("小白，3岁，白色");
		}else if(name.equals("小花")){
			System.out.println("小花，100岁，花色");
		}else{
			System.out.println("张奶奶没有这只小猫");
		}
	}
}
//1.用一个个变量组成  //缺点·1变量太多
//2.用一个数组将变量全部包含  //缺点里面的类型唯一如果用string就不能进行改变只能通过
//数组加下标的方式获取信息，造成内容和名字不符
//3.类与对象
//定义一个猫类
//
class leiandduixiang1{
	public static void main(String[] args){
		Cat cat1=new Cat();//new Cat()创建一个猫  Cat cat1=new Cat()将创建的猫赋值给cat1
		cat1.name="小白";
		cat1.age=3;
		cat1.color="白色";
		Cat cat2=new Cat();
		cat2.name="小花";
		cat2.age=100;
		cat2.color="花色";
		System.out.println("第一只猫信息"+cat1.name+" "+cat1.age+" "+cat1.color);
		System.out.println("第二只猫信息"+cat2.name+" "+cat2.age+" "+cat2.color);
	}
}
class Cat{
	String name;
	int age;
	String color;
}