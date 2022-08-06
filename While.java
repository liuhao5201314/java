//while循环控制
//while(循环条件){
//	循环语句
//	循环迭代
//}
//while的4要素和for相同只是位置不同
//for--循环变量初始化---循环条件---循环操作---循环迭代----循环条件
//while循环变量初始化---循环条件---循环操作---循环迭代----循环条件
//while是先判断再执行
//while循环条件返回的是一个布尔值的表达式

import java.util.Scanner;
public class While{
	public static void main(String[] args){
		int i=1;
		while(i<=10){
			System.out.println("刘浩"+" "+i);
			i++; 
		}
	}
}

class While1{
	public static void main(String[] args){
		System.out.println("本程序用于输出一定范围内莫数的倍数");
		int i=1;
		int sum=100;
		int tem=3;
		while(i<=sum){
			int count=i%tem;
			if(count==0){
				System.out.println(i);
			}
			i++;
		}
	}
}

class While2{
	public static void main(String[] args){
		System.out.println("本程序用于输出一定范围偶数");
		int i=40,start=40;
		int end=200;
		while(i>=start&&i<=end){
			int count=i%2;
			if(count==0){
				System.out.println(i);
			}
			i++;
		}
	}
}