//˼·����
//һ.�Լ�����
//import java.util.Arrays
//arr=Arrays.copyOf(arr,arr.length+1)
//��.
//1.����ԭʼ����
//2.����һ��������int arrNew=new int[arr.lengtharr]
//3.������arr������arrNew����
//4.��Ҫ��ֵ������arrNew arrNew[arrNew.length-1]=4;
//5.��arrָ��arrNew  arr=arrNew;����arr�ͻ��Զ����ٵõ��µ�arr�ͳɹ�����
//6.����һ��Scanner�����û�����
//7.ʹ��һ����ѭ��while/do while
//
import java.util.Scanner;
import java.util.Arrays;
public class Array1{
	public static void main(String[] args){
		//�������ʵ�ֶ����ݵ�����
		Scanner input=new Scanner(System.in);
		int ary[]={1,2,3};
		int i=0;
		System.out.println("��ѡ���Ƿ���������y/n");
		char choose=input.next().charAt(0);
		if(choose=='y'){
			ary=Arrays.copyOf(ary, ary.length+1);//��ԭ�������������
			System.out.println("���ݳɹ�");
			System.out.println("�������ݵ�������ֵ");
			int in=input.nextInt();
			ary[ary.length-1]=in;
			System.out.println("����Ϊ");
			for(i=0;i<ary.length;i++){
				System.out.println(ary[i]);
			}
		}else{
			System.out.println("����Ϊ");
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
		System.out.println("�������ݴ�С");
		int tem=input.nextInt();
		int arrNew[]=new int[arr.length+tem];
		for(i=0;i<arr.length;i++){
			arrNew[i]=arr[i];
		}
		System.out.println("�������ݺ��������ֵ");
		for(i=arr.length;i<arrNew.length;i++){
			int in=input.nextInt();
			arrNew[i]=in;
		}
		arr=arrNew;
		System.out.println("������ݺ������");
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("��ѡ���Ƿ������������y/n");
		char choose=input.next().charAt(0);
		while(true){
			if(choose=='y'){
				System.out.println("�������ݴ�С");
				int count=input.nextInt();
				int arrNew1[]=new int[arr.length+count];
				for(i=0;i<arr.length;i++){
					arrNew1[i]=arr[i];
				}
				System.out.println("�������ݺ��������ֵ");
				for(i=arr.length;i<arrNew1.length;i++){
					int in=input.nextInt();
					arrNew1[i]=in;
					arr=arrNew1;
					System.out.println("������ݺ������");
					for(i=0;i<arr.length;i++){
						System.out.println(arr[i]+" ");
					}
					System.out.println("��ѡ���Ƿ������������y/n");
					choose=input.next().charAt(0);
				}
			}
				if(choose=='n'){
				System.out.println("�˳�����������");
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
		System.out.println("������������");
		int arr[]={1,2,3,4,5,6};
		int i=0;
		labe:while(true){
			System.out.println("����������С");
			int tem=input.nextInt();
			if(tem>arr.length){
				System.out.println("����������������������");
				continue labe;
			}
			int arrNew[]=new int[arr.length-tem];

			for(i=0;i<arrNew.length;i++){
				arrNew[i]=arr[i];
			}
			arr=arrNew;
			if(arr.length==1){
				System.out.println("�������һ��Ԫ���ˣ�����������");
			}
			System.out.println("���Ϊ");
			for(i=0;i<arrNew.length;i++){
				System.out.println(arrNew[i]+" ");
			}
			System.out.println("��ѡ���Ƿ������С����y/n");
			char choose=input.next().charAt(0);
			if(choose=='n'){
				break;
			}
		}
	}
}
