//排序
//Math.random()生成随机数
//内部排序：将所有数据加载到内部
//
//外部排序：将一部分数据加载到内部进行排序
//
//介绍冒泡排序：
//依次比较相临的元素，将较大的排到数组后面
//一个需要n-1次每个需要进行n-i次对比
//第一次将目标大的排到后面
//第二次将第二大的数排到到数第二位置
//
//
//
import java.util.Scanner;
import java.util.Arrays;
public class Sort{
	public static void main(String[] args){
		int i=0;
		int j=0;
		int tem;
		int count=0;//记录交换次数，如果有一次没有进行交换就说明有序就退出循环
		int arr[]={12,23,25,27,37,39};
		labe:for(i=0;i<(arr.length-1);i++){//轮数
			for(j=0;j<(arr.length-i-1);j++){//次数
				if(arr[j]>arr[j+1]){
					tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
					count++;
				}
				if(i==count){
					System.out.println("执行");
					break labe;//如果i和count相同就说明一次没有进入if判定
				}
			}
		}
		System.out.print("排序后为");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
