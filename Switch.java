import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
		//switch关键字
		//case当--必须是常量（常量表达式）不能为变量且类型要一致，或者可以自动转换为相互比较类型如char和int
		//switch里面的返回值必须为（byte,short,int,char,enum,String)
		//break退出switch
		//default否则---直接执行(可以没有)
		//当判断到case就会执行下面全部程序（如果没有break）不会对case进行判断一直执行到break（穿透）
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入a-g");
		char Tian = myScanner.next().charAt(0);
		switch(Tian){
			case 'a':
			System.out.println("星期一");
			break;
			case 'b':
			System.out.println("星期二");
			break;
			case 'c':
			System.out.println("星期三");
			break;
			case 'd':
			System.out.println("星期四");
			break;
			case 'e':
			System.out.println("星期五");
			break;
			case 'f':
			System.out.println("星期六");
			break;
			case 'g':
			System.out.println("星期日");
			break;
			default:
			System.out.println("输入错误");
			break;
		}
	}
}


class Switch1{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入a-e");
		char Zhimu = myScanner.next().charAt(0);
		switch(Zhimu){
			case 'a':
				System.out.println("A");
			break;
			case 'b':
				System.out.println("B");
			break;
			case 'c':
				System.out.println("C");
			break;
			case 'd':
				System.out.println("D");
			break;
			case 'e':
				System.out.println("E");
			break;
			default:
				System.out.println("other");
		}
	}
}


class Switch2{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入学生成绩");
		int score = myScanner.nextInt();
		if(score>0&&score<100){
			int tem=score/60;
			switch(tem){
				case 0:
					System.out.println("成绩不合格");
				break;
				case 1:
					System.out.println("成绩合格");
				break;
			}
		}
		else{
			System.out.println("成绩格式错误");
		}
	}
}


class Switch3{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入季节");
		int seasons=myScanner.nextInt();
		switch(seasons){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
			break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
			break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
			break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
			break;
		}
	}
}