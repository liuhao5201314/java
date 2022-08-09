//跳转控制语句
//用于结束本次循环，继续执行下一次循环
//也可以通过标签控制跳过某个循环label
//执行到continue就会跳转到循环条件进行下次判断
import java.util.Scanner;
public class Continue{
	public static void main(String[] args){
		labe1:
		for(int j=0;j<4;j++){
			labe2:
			for(int i=0;i<10;i++){
				if(i==2){
					//continue labe1;
					continue;
				}
				System.out.println("i="+i);
			}
		}
	}
}

//内存j=0 i=0 i=1 i=2 j=1 i=0 
//输出i=0 i=1 i=0 
//01010101
//内存j=0 i=0 i=1 i=2 i=3
//输出i=0 i=1 i=3
//012456789*4