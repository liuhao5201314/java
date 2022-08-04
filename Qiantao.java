import java.util.Scanner;
public class Qiantao{
	public static void main(String[] args){
		//if嵌套
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩");
		double Chengji = myScanner.nextDouble();
		if (Chengji>8.0) {
			System.out.println("请输入性别");
			char gender = myScanner.next().charAt(0);
			if(gender=='男'){
				System.out.println("进入男子组");
			}
			else if (gender=='女') {
				System.out.println("进入女子组");
			}
			else{
				System.out.println("输入错误");
			}
		}
		else{
			System.out.println("成绩不合格");
		}
	}
}


class Menpiao{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int yue = myScanner.nextInt();
		if (yue>0&&yue<=12) {
			if(yue>=4&&yue<=10){
				System.out.println("请输入年龄");
				int age = myScanner.nextInt();
				if (age>=18&&age<=60){
					System.out.println("旺季成人票60");
				}
				else if(age>0&&age<18){
					System.out.println("旺季未成人票30");
				}
				else if (age>60){
					System.out.println("旺季老人票20");
				}
				else{
					System.out.println("输入年龄错误");
				}
			}
			else{
				System.out.println("请输入年龄");
				int age = myScanner.nextInt();
				if (age>=18&&age<=60){
					System.out.println("淡季成人票40");
				}
				else{
					System.out.println("淡季老年/未成年票20");
				}
			}
		}
		else{
			System.out.println("输入错误");
		}
	}
}