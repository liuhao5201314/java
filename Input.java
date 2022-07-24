import java.util.Scanner;//导入包java.util里面的包Scanner
public class Input{
	public static void main(String[] args){
		//类名首字母大写
		//变量名第二个字母开始大写
		//常量名全大写
		//演示接受用户的输入  包--》类
		//1.引入Scanner类
		//2.创建一个Scanner对象
		//3.接收用户输入
		Scanner myScanner = new Scanner(System.in);//2
		System.out.println("请输入名字");
		String name = myScanner.nextString();//3.接收一个用户输入的字符串
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();//3.接收一个用户输入的字符串
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();//3.接收一个用户输入的字符串
		System.out.println("人的信息如下：");
		System.out.println("姓名="+name+"年龄="+age+"薪水="+sal);
	}
}