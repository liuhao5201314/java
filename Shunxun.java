import java.util.Scanner;
public class Shunxun{
	public static void main(String[] args){
		//if else
		//单分支
		//双分支
		//多分支
		//编写一个顺序
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int shuzhi = myScanner.nextInt();
		if (shuzhi>18) {
			System.out.println("成年");
		}
		else{
			System.out.println("未成年");
		}
	}
}
//双分支
//if--else
//
class Lianxi1{
	public static void main(String[] args){
		double a=10.5;
		double b=20.5;
		if (a>10.0) {
			if (b>20.0) {
				System.out.println(a+b);
			}
		}
	}
}

class Lianxi2{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请一个整数字");
		int inPut = myScanner.nextInt();
		if (inPut%3==0) {
			if (inPut%5==0) {
				System.out.println(inPut);
			}
		}
		else{
			System.out.println("不能被整除");
		}
	}
}

class Lianxi3{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请一个年份");
		int nian = myScanner.nextInt();
		if ((nian%4==0&&nian%100!=0)||(nian%400==0)) {
				System.out.println("这是闰年");
		}
		else{
			System.out.println("这不是闰年");
		}
	}
}