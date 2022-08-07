import java.util.Scanner;
public class Manycirculate{
	public static void main(String[] args){
		//最多循环二层
		//尽量不要超过3层循环
		//内层循环结束进入外层循环，直到外层循环结束
		//嵌套循环就是吧内层循环当作外层循环的循环体
		//
		int i=0;
		int j=0;
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.println("i="+i+"j="+j);//i=0 j=0 
												  //i=0 j=1
												  //i=0 j=2
												  //i=0 j=3--出去
												  //i=1 j=0
												  //i=1 j=1
												  //i=1 j=2
												  //i=1 j=3--出去
												  //i=2--退出循环
												  //结果i=0 j=0 i=0 j=1 i=0 j=2
												  //    i=1 j=0 i=1 j=1 i=1 j=2
			}
		}
	}
}

//化繁为简
//1.统计一个班级成绩
//2.得到该班级平均分，定义一个变量统计班级成绩
//3.统计三个班级的成绩
//4.求出所有班级平均分
//5.统计及格人数
//6.进行优化效率，可读性，结构
//化死为活
//1.将班级个数，人员个数变成变量
class Manycirculate1{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("本程序用于统计3个班级学生（5）平均分和及格人数");
		int i=1;
		int j=1;
		double sum=0;
		double sum1=0;
		double count=0;
		double count1=0;
		int tem=0;
		for(i=1;i<=3;i++){
			for(j=1;j<=5;j++){
				System.out.println("请输入"+i+"班"+"第"+j+"个学生成绩");
				int student=myScanner.nextInt();
				if(student>60){
					tem++;
				}
				sum+=student;
			}
			count =sum/j;
			System.out.println(i+"班级平均分为"+count);
			sum1+=count;
		}
		count1=sum1/i;
		System.out.println("年级平均分为"+count1);
		System.out.println("年级及格人数"+tem);
	}
}

//化繁为简
//1.打印第一行
class Manycirculate2{
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

class Manycirculate3{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("本程序用于输出半个金字塔");
		System.out.println("请输入金字塔层数");
		int row=myScanner.nextInt();
		int i=1;
		int j=1;
		for(j=1;j<=row;j++){
			for(i=1;i<=j;i++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

class Manycirculate4{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("本程序用于输出实心金字塔");
		System.out.println("请输入金字塔层数");
		int row=myScanner.nextInt();
		int i=1;//表示当前层数*个数
		int j=1;//表示当前第几层
		int k=1;//表示当前层数空格
		for(j=1;j<=row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			for(i=1;i<=(2*j-1);i++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

class Manycirculate5{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("本程序用于输出空心金字塔");
		System.out.println("请输入金字塔层数");
		int row=myScanner.nextInt();
		int i=1;//表示当前层数*个数
		int j=1;//表示当前第几层
		int k=1;//表示当前层数空格
		int m=1;//表示金字塔内部的空格数
		for(j=1;j<row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(i=1;i<=(2*(j-1)-1);i++){
				System.out.print(" ");
			}
			if(j>1){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i=1;i<=(2*j-1);i++){
			System.out.print("*");
		}
	}
}
//思路分析
//化繁为简
//1.先打印一个矩形
//2.打印半个金字塔
//3.打印整个金字塔,考虑输出空格
//星为2*j-1
//空格为row-j总层数-当前层数
//4.输出空心金字塔
//找规律
//   *      当前行的首位位置为*
//  * *     当前首位为*，1个空格
// *   *    
//*******
//5.变活使能够改变层数
class Manycirculate6{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("本程序用于输出实心金字塔");
		System.out.println("请输入金字塔层数");
		int row=myScanner.nextInt();
		int i=1;//表示当前层数*个数
		int j=1;//表示当前第几层
		int k=1;//表示当前层数空格
		for(j=1;j<=row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			for(i=1;i<=(2*j-1);i++){
				if(i==1||i==(2*j-1)||j==row){//当为首或尾或者最后一行的时候就输出*
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}


class Manycirculate7{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("本程序用于输出空心菱形");
		System.out.println("请输入菱形层数");
		int row=myScanner.nextInt();
		int i=1;//表示当前层数*个数
		int j=1;//表示当前第几层
		int k=1;//表示当前层数空格
		for(j=1;j<=row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			for(i=1;i<=(2*j-1);i++){
				if(i==1||i==(2*j-1)){//当为首或尾或者最后一行的时候就输出*
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(j=1;j<row;j++){
			for(k=1;k<=j;k++){
				System.out.print(" ");
			}
			for(i=1;i<=(row-j)*2-1;i++){
				if(i==1||i==((row-j)*2-1)){//当为首或尾或者最后一行的时候就输出*
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}