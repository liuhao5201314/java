public class Weiyiyunsuan{
	public static void main(String[] args){
		//~按位取反
		//~2=~0010=1101=1100--1011--=-3
		int f=~2;//-3
		int a=1<<2;//100=4
		int b=1>>2;//0
		int c=-1>>2;//1001--1110--1111--1001=-1
		int d=-1<<2;//1001--1110--1111--1100=-4
		int e=3>>>2;//算数位移
		int g=2&3;
		int h=~-2;
		int l=~2;
		int j=2|3;
		int k=2^3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);//2
		System.out.println(h);//1
		System.out.println(l);//-3
		System.out.println(j);//3
		System.out.println(k);//1

		//原反补
		//1.二进制最高位为符号位：0表示正，1表示负
		//2.正数原/反/补码相同
		//3.负数反码为原码符号位不变其他取反
		//4.负数补码等于反码加一，反码为补码减一
		//5.0的原反补都为0
		//6.java中的数都是有符号的
		//7.计算机运算都是按补码进行计算的
		//8.当我们看见运算结果是看见它的原码
	}
}

//建立在二进制上面  32位
//按位与&：二位全为1，结果为1，否则为0
//按位或|：有1为1，结果为1，否则为0
//按位异或^:相应位置不同为1
//按位取反~：
//练习
//2&3=0010&0011=0010=2
//~-2=~1010=~1101=~1110=0001=1
//~2=0010=1101=1100=1011=-3
//2|3=0010|0011=0011=3
//2^3=0010^0011=0001=1