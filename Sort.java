//����
//Math.random()���������
//�ڲ����򣺽��������ݼ��ص��ڲ�
//
//�ⲿ���򣺽�һ�������ݼ��ص��ڲ���������
//
//����ð������
//���αȽ����ٵ�Ԫ�أ����ϴ���ŵ��������
//һ����Ҫn-1��ÿ����Ҫ����n-i�ζԱ�
//��һ�ν�Ŀ�����ŵ�����
//�ڶ��ν��ڶ�������ŵ������ڶ�λ��
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
		int count=0;//��¼���������������һ��û�н��н�����˵��������˳�ѭ��
		int arr[]={12,23,25,27,37,39};
		labe:for(i=0;i<(arr.length-1);i++){//����
			for(j=0;j<(arr.length-i-1);j++){//����
				if(arr[j]>arr[j+1]){
					tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
					count++;
				}
				if(i==count){
					System.out.println("ִ��");
					break labe;//���i��count��ͬ��˵��һ��û�н���if�ж�
				}
			}
		}
		System.out.print("�����Ϊ");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
