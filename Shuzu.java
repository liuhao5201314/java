//数组array
//
//可通过数组名.length得到数组长度
import java.util.Scanner;
public class Shuzu{
	public static void main(String[] args){
		double[] hens={3.5,46,53,23,56,4.7};
		int i=0;
		double sum=0;
		for(i=0;i<hens.length;i++){
			sum+=hens[i];
		}
		System.out.println(sum/hens.length);
	}
}

//数组的使用1动态内存初始化
//声明和创建一步完成
//数据类型 数组名[]=new 数据类[大小]
//int a[]=new int[5];
//默认从0开始作为下标计数
//
//数组使用2动态内存初始化
//声明：int[] a=int a[]
//可以先声明再创建
//创建：a=new int[10];
//
//数组使用3静态内初始化
//数据类型 数组名[]={元素值，元素值}
//int a[]={1，3}
//
class Array1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//对于输入函数
		//Scanner input=new Scanner(System.in);
		// int name=input.nextInt();
		// String name=input.next();
		// char name=input.next().charAt(0);
		int count[]=new int[5];
		int i=0;
		for(i=0;i<count.length;i++){
			System.out.println("请输入第"+(i+1)+"个成绩");
			count[i]=input.nextInt();
		}
		for(i=0;i<count.length;i++){
			System.out.println("第"+(i+1)+"个成绩为"+count[i]);
		}
	}
}

//数组细节
//1.数组是多个相同类型的数据的组合，实现对数据的统一管理
//2.数组中的元素可以为任何类型，包括基本数据类型和引用数据类型，但是必须为相同类型或可以向其转化
//3.数组创建后有默认的数值，int=0 short=0 byte=0 long=0 float=0.0 double=0.0
//cha=\u0000 boolean=false String=null
//4.数组下标是从0开始
//5.数组下标不能越界使用
//6.数组属于引用类型，数组数据类型是对象object
class Array2{
	public static void main(String[] args){
		int str[]=new int[26];
		int i=0;
		for(i=0;i<26;i++){
			str[i]='A'+i;//str[i]=(char)('A'+i)强制转换
		}
		for(i=0;i<26;i++){
			System.out.print((char)str[i]+" ");
		}
	}
}
//冒泡排序
//相临二个数进行比较交换进行多少次从第一个数字开始进行比较
//每个数字需要进行多少次比较，每个数字和后面数字进行比较（长度-i）
class Array3{
	public static void main(String[] args){
		int str[]={4,-1,9,10,23};
		int i=0;
		int j=0;
		int tem=0;
		for(i=1;i<str.length;i++){//个数字进行4次比较
			for(j=0;j<(str.length-i);j++){//从什么位置开始进行比较
				if(str[j]>str[j+1]){
					tem=str[j];
					str[j]=str[j+1];
					str[j+1]=tem;
				}
			}
		}
		for(i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}
	}
}

//比较大小先假设第一个最大值再进行比较后更换最大值
//先假设最大值下标为0
//数组的赋值
//对于基本数据类型赋值，赋值方式为值赋值
//数组默认情况为引用传递，赋的是地址，赋值方式为引用传递
//是一个地址arr2的变化会影响arr1
//c里面数组是有顺序排序的java是分散独立的不一定有顺序
//c里面不存在地址传递，但是有传递数组名为传递整个数组首地址
//值传递和地址传递的区别
//jvm内存（java内存）
//栈                              堆                   方法区
//n1->[10]                     0x0011
//n2->[10]->[20]               arr1[0]
//arr1[3]->0x0011              arr1[1]
//arr2[3]->arr1[3]->0x0011     arr1[2]
//arr2=arr1就将二个数组联系一起
//对于得到单独数组将数组1拷贝到数组2，要求数据空间独立

class Array4{
	public static void main(String[] args){
    	int n1=10;
		int n2=n1;
		n2=20;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		//输出的n2不会返回影响n1的输出
		//数组赋值为地址赋值
		int arr1[]={1,2,3};
		int arr2[]=arr1;
		arr2[0]=100;
		int i=0;
		for(i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);//输出arr1=arr2
		}
	}
}

//对于得到单独数组将数组1拷贝到数组2，要求数据空间独立
class Array5{
	public static void main(String[] args){
		int arr1[]={10,20,30};
		//int arr2[]=arr1;
		//创建新的数组arr2开辟新的空间大小为arr1
		//再将让arr1拷贝到arr2内部
		//得到一个独立的相同的二个数组
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
	}
}
//数组反转
//方法1：找规律颠倒前后
class Array6{
	public static void main(String[] args){
		int arr[]={11,22,33,44,55,66};
		int tem=0;
		int i=0;
		for(i=0;i<(int)(arr.length/2);i++){
			tem=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=tem;
		}
		System.out.println("逆序后的数组为：");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

//方法2：逆序赋值
//1.创建一个新的数组arr2大小arr.length
//2.将arr中的每个元素拷贝到arr2当中
//
class Array7{
	public static void main(String[] args){
		int arr[]={11,22,33,44,55,66};
		int arr2[]=new int[arr.length];
		int i=0;
		for(i=0;i<arr.length;i++){
			arr2[i]=arr[arr.length-1-i];
		}
		//arr=arr2
		//把arr指向arr2这样arr就相当于没有使用就销毁了
		System.out.println("翻转后");
		for(i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
	}
}
