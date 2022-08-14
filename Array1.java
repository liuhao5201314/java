//思路分析
//一.自己扩容
//import java.util.Arrays
//arr=Arrays.copyOf(arr,arr.length+1)
//二.
//1.定义原始数组
//2.定义一个新数组int arrNew=new int[arr.lengtharr]
//3.将数组arr遍历到arrNew当中
//4.将要赋值的数给arrNew arrNew[arrNew.length-1]=4;
//5.让arr指向arrNew  arr=arrNew;这样arr就会自动销毁得到新的arr就成功扩容
//6.创建一个Scanner接收用户输入
//7.使用一个死循环while/do while
//
import java.util.Scanner;
import java.util.Arrays;
public class Array1{
	public static void main(String[] args){
		//数据添加实现对数据的扩容
		Scanner input=new Scanner(System.in);
		int ary[]={1,2,3};
		int i=0;
		System.out.println("请选择是否扩大数组y/n");
		char choose=input.next().charAt(0);
		if(choose=='y'){
			ary=Arrays.copyOf(ary, ary.length+1);//将原来数组进行扩容
			System.out.println("扩容成功");
			System.out.println("输入扩容的数组数值");
			int in=input.nextInt();
			ary[ary.length-1]=in;
			System.out.println("数组为");
			for(i=0;i<ary.length;i++){
				System.out.println(ary[i]);
			}
		}else{
			System.out.println("数组为");
			for(i=0;i<ary.length;i++){
				System.out.println(ary[i]);
			}
		}
	}
}

//import java.util.Scanner;
//import java.util.Arrays;
class Array2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int arr[]={1,2,3};
		int i=0;
		System.out.println("输入扩容大小");
		int tem=input.nextInt();
		int arrNew[]=new int[arr.length+tem];
		for(i=0;i<arr.length;i++){
			arrNew[i]=arr[i];
		}
		System.out.println("输入扩容后数组的数值");
		for(i=arr.length;i<arrNew.length;i++){
			int in=input.nextInt();
			arrNew[i]=in;
		}
		arr=arrNew;
		System.out.println("输出扩容后的数组");
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("请选择是否继续扩大数组y/n");
		char choose=input.next().charAt(0);
		while(true){
			if(choose=='y'){
				System.out.println("输入扩容大小");
				int count=input.nextInt();
				int arrNew1[]=new int[arr.length+count];
				for(i=0;i<arr.length;i++){
					arrNew1[i]=arr[i];
				}
				System.out.println("输入扩容后数组的数值");
				for(i=arr.length;i<arrNew1.length;i++){
					int in=input.nextInt();
					arrNew1[i]=in;
					arr=arrNew1;
					System.out.println("输出扩容后的数组");
					for(i=0;i<arr.length;i++){
						System.out.println(arr[i]+" ");
					}
					System.out.println("请选择是否继续扩大数组y/n");
					choose=input.next().charAt(0);
				}
			}
				if(choose=='n'){
				System.out.println("退出扩容输出结果");
				for(i=0;i<arr.length;i++){
					System.out.println(arr[i]+" ");
				}
				break;
			}
		}

	}
}

class Array3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("进行缩减数组");
		int arr[]={1,2,3,4,5,6};
		int i=0;
		labe:while(true){
			System.out.println("输入缩减大小");
			int tem=input.nextInt();
			if(tem>arr.length){
				System.out.println("输入缩减过大请重新输入");
				continue labe;
			}
			int arrNew[]=new int[arr.length-tem];

			for(i=0;i<arrNew.length;i++){
				arrNew[i]=arr[i];
			}
			arr=arrNew;
			if(arr.length==1){
				System.out.println("这是最后一个元素了，不能缩减了");
			}
			System.out.println("结果为");
			for(i=0;i<arrNew.length;i++){
				System.out.println(arrNew[i]+" ");
			}
			System.out.println("请选择是否继续缩小数组y/n");
			char choose=input.next().charAt(0);
			if(choose=='n'){
				break;
			}
		}
	}
}
