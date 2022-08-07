//do{
//	循环体
//	循环变量迭代
//}while(循环条件);
//先执行再判断，一定会执行一次
//
//比如菜单必须显示一次的情况
//循环变量初始化--循环体---循环迭代---循环判断
//循环条件返回为一个布尔值表达式
//
import java.util.Scanner;
public class Dowhile{
	public static void main(String[] args){
		int i=1;
		do{
			System.out.println("liuhao"+i);
			i++;
		}while(i<=10);
	}
}


class Dowhile1{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		int end=100;
		do{
			System.out.print(i+" ");
			sum+=i;
			i++;
		}while(i<=end);
		System.out.println("和="+sum);
	}
}
//变死为活
//将范围和赋值进行改变
class Dowhile2{
	public static void main(String[] args){
		int i=1;
		int end=200;
		do{
			if(i%5==0&&i%3!=0){
				System.out.println(i);
			}
			i++;
		}while(i<=end);
	}
}

//字符可以进行比较
//字符串进行比较要运用函数进行对比输出
class Dowhile3{
	public static void main(String[] args){
		char tem=' ';
		Scanner myScanner = new Scanner(System.in);
		do{
			System.out.println("你愿意吗，请回答Y/N");
			tem = myScanner.next().charAt(0);
			System.out.println("你的回答说"+tem);
		}while(tem!='Y');
		System.out.println("恭喜你");
	}
}