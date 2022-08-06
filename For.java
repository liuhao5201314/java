import java.util.Scanner;
public class For{
	public static void main(String[] args){
		//for循环控制
		int i=1;//可以把初始化写在外面
		for(i=1;i<=10;i++){
			System.out.println("刘浩");
		}
	}
}
//for循环注意细节
//初始化，循环条件，自增
//for(,,)无限循环
//ctrl+c退出循环
//循环判断条件二边可以省略，中间不可以
//循环的初始值可以多条初始值，但是要求类型一致，中间用逗号隔开，
//循环变量的迭代可以有多条中间也是逗号隔开
//先初始化，再判断，再循环，最后迭代
//
class For1{
	public static void main(String[] args){
		int count = 3;
		int i=1,j=1;
		for(i=0,j=0;i<count;i++,j+=2){
			System.out.println("i="+i+"j="+j);//0,0/1,2/2,4/3就会退出循环了

		}
	}
}

//化繁为简
//1.完成输出1-100
//2.过滤出9的倍数i%9==0
//3.统计格数
//4.计算总和
//先死后活
//1.为了适应更好需求把范围变成活得
//2.把要求的倍数作成变量
class For2{
	public static void main(String[] args){
		int i=1;
		int j=0;
		int sum=0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("本程序用于输出一定范围内莫数的倍数并求和");
		System.out.println("请输入起始数");
		int start=myScanner.nextInt();
		System.out.println("请输入结束数");
		int end=myScanner.nextInt();
		System.out.println("请输入需要的倍数");
		int multiple=myScanner.nextInt();
		for(i=start;i<=end;i++){
			if(i%multiple==0){
				System.out.print(i+" ");
				j++;
				sum+=i;
			}
		}
		System.out.println("总数"+j);
		System.out.println("和"+sum);
	}
}

class For3{
	public static void main(String[] args){
		int i=0;
		int j=0;
		for(i=0,j=5;i<=5&&j>=0;i++,j--){
			System.out.println(i+"+"+j+"="+(i+j));
		}
	}
}
//化繁为简
//1.输出0-5
//2.后面数字可以用5-i解决
//先死后活
class For4{
	public static void main(String[] args){
		int n =5;
		for(int i=0;i<=n;i++){
			System.out.println(i+"+"+(n-i)+"="+n);
		}
	}
}


class For5{
	public static void main(String[] args){
		System.out.println("本程序用于输出乘法表");
		int row=9;//行
		//int list=9;
		int i=1,j=1;
		for(j=1;j<=row;j++){
			for(i=1;i<=j;i++){
				System.out.print(i+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");
		}
	}
}