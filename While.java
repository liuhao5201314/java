//whileѭ������
//while(ѭ������){
//	ѭ�����
//	ѭ������
//}
//while��4Ҫ�غ�for��ֻͬ��λ�ò�ͬ
//for--ѭ��������ʼ��---ѭ������---ѭ������---ѭ������----ѭ������
//whileѭ��������ʼ��---ѭ������---ѭ������---ѭ������----ѭ������
//while�����ж���ִ��
//whileѭ���������ص���һ������ֵ�ı��ʽ

import java.util.Scanner;
public class While{
	public static void main(String[] args){
		int i=1;
		while(i<=10){
			System.out.println("����"+" "+i);
			i++; 
		}
	}
}

class While1{
	public static void main(String[] args){
		System.out.println("�������������һ����Χ��Ī���ı���");
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
		System.out.println("�������������һ����Χż��");
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