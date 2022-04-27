public class Shujuleixing{
	public static void main(String[] args){
		int n1 = 1;
		//int n2 = 1l;//long型不能放入int
		long n3 = 1l;
		//float n4 = 1.1;//double不能存入float
		float n5 = 1.1f;
		double n6 = 1.1;
		double n7 = 1.1f;//允许
		double n8 = 2.7;
		double n9 = 8.1 / 3.0;//
		System.out.println(n8);
		System.out.println(n9);
		//错误写法(这样是不会出现相同的，小数运算要小心)
		if(n8 == n9){
			System.out.println("相同");
		}
		System.out.println(Math.abs(n8 - n9));
		//正确写法ctrl+/多行注释
		if(Math.abs(n8 - n9)<0.0000001){//差值非常小到规定精度
			System.out.println("相同");
		}
	}
}
//java数据类型分为1.基本数据类型：数值型 整数：byte[1]\short[2]\int[4]\long[8]
//                                    小数：float[4]\double[8]
//                              字符型 char[2]存放单个字符'a',c里面char为1字节
//                              布尔型 boolean 存放turn false     
//                              
//               2.引用数据类型：类（class）---String
//                              接口（interface）               
//                              数组（[]）
//                              
//java整数类型的使用
//byte n1=10;//指向数据空间为1字节-128~127
//short n2=10;//空间不同                              
//int
//long
//
//java整型细节
//java具有固定的范围和字段长度。不受操作系统的影响
//java的整型常量默认值为int，声明Long型常量必须在后面加上'l'/'L'
//byte n1=3;  0000 0011(第一位为符号位)
//short n2=3; 0000 0000 0000 0011
//
//java浮点类型的使用
//float(符号位+指数位+尾数位)（小数都为近似值由于尾数位容易丢失）
//double
//
//java浮点类型细节
//java浮点类型默认为double声明float时要在后面加上'f'/'F'
//浮点型表示方法1.十进制形式
//             2.科学计数法5.12e2[5.12*100]  5.12e-2[5.12/100]
//我们对于运算结果为小数的判断要小心
//应该以二个数差值的绝对值在莫个范围内进行判断
//如果小数是直接赋值就可以进行判断相等
//
//
//java的API相当于c的库函数
//https://www.matools.com/api
//JDK8,11----包----类----字段
//                 接口--构造器
//                 异常--成员方法