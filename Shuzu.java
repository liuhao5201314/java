//����array
//
//��ͨ��������.length�õ����鳤��
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

//�����ʹ��1��̬�ڴ��ʼ��
//�����ʹ���һ�����
//�������� ������[]=new ������[��С]
//int a[]=new int[5];
//Ĭ�ϴ�0��ʼ��Ϊ�±����
//
//����ʹ��2��̬�ڴ��ʼ��
//������int[] a=int a[]
//�����������ٴ���
//������a=new int[10];
//
//����ʹ��3��̬�ڳ�ʼ��
//�������� ������[]={Ԫ��ֵ��Ԫ��ֵ}
//int a[]={1��3}
//
class Array1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//�������뺯��
		//Scanner input=new Scanner(System.in);
		// int name=input.nextInt();
		// String name=input.next();
		// char name=input.next().charAt(0);
		int count[]=new int[5];
		int i=0;
		for(i=0;i<count.length;i++){
			System.out.println("�������"+(i+1)+"���ɼ�");
			count[i]=input.nextInt();
		}
		for(i=0;i<count.length;i++){
			System.out.println("��"+(i+1)+"���ɼ�Ϊ"+count[i]);
		}
	}
}

//����ϸ��
//1.�����Ƕ����ͬ���͵����ݵ���ϣ�ʵ�ֶ����ݵ�ͳһ����
//2.�����е�Ԫ�ؿ���Ϊ�κ����ͣ����������������ͺ������������ͣ����Ǳ���Ϊ��ͬ���ͻ��������ת��
//3.���鴴������Ĭ�ϵ���ֵ��int=0 short=0 byte=0 long=0 float=0.0 double=0.0
//cha=\u0000 boolean=false String=null
//4.�����±��Ǵ�0��ʼ
//5.�����±겻��Խ��ʹ��
//6.���������������ͣ��������������Ƕ���object
class Array2{
	public static void main(String[] args){
		int str[]=new int[26];
		int i=0;
		for(i=0;i<26;i++){
			str[i]='A'+i;//str[i]=(char)('A'+i)ǿ��ת��
		}
		for(i=0;i<26;i++){
			System.out.print((char)str[i]+" ");
		}
	}
}
//ð������
//���ٶ��������бȽϽ������ж��ٴδӵ�һ�����ֿ�ʼ���бȽ�
//ÿ��������Ҫ���ж��ٴαȽϣ�ÿ�����ֺͺ������ֽ��бȽϣ�����-i��
class Array3{
	public static void main(String[] args){
		int str[]={4,-1,9,10,23};
		int i=0;
		int j=0;
		int tem=0;
		for(i=1;i<str.length;i++){//�����ֽ���4�αȽ�
			for(j=0;j<(str.length-i);j++){//��ʲôλ�ÿ�ʼ���бȽ�
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

//�Ƚϴ�С�ȼ����һ�����ֵ�ٽ��бȽϺ�������ֵ
//�ȼ������ֵ�±�Ϊ0
//����ĸ�ֵ
//���ڻ����������͸�ֵ����ֵ��ʽΪֵ��ֵ
//����Ĭ�����Ϊ���ô��ݣ������ǵ�ַ����ֵ��ʽΪ���ô���
//��һ����ַarr2�ı仯��Ӱ��arr1
//c������������˳�������java�Ƿ�ɢ�����Ĳ�һ����˳��
//c���治���ڵ�ַ���ݣ������д���������Ϊ�������������׵�ַ
//ֵ���ݺ͵�ַ���ݵ�����
//jvm�ڴ棨java�ڴ棩
//ջ                              ��                   ������
//n1->[10]                     0x0011
//n2->[10]->[20]               arr1[0]
//arr1[3]->0x0011              arr1[1]
//arr2[3]->arr1[3]->0x0011     arr1[2]
//arr2=arr1�ͽ�����������ϵһ��
//���ڵõ��������齫����1����������2��Ҫ�����ݿռ����

class Array4{
	public static void main(String[] args){
    	int n1=10;
		int n2=n1;
		n2=20;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		//�����n2���᷵��Ӱ��n1�����
		//���鸳ֵΪ��ַ��ֵ
		int arr1[]={1,2,3};
		int arr2[]=arr1;
		arr2[0]=100;
		int i=0;
		for(i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);//���arr1=arr2
		}
	}
}

//���ڵõ��������齫����1����������2��Ҫ�����ݿռ����
class Array5{
	public static void main(String[] args){
		int arr1[]={10,20,30};
		//int arr2[]=arr1;
		//�����µ�����arr2�����µĿռ��СΪarr1
		//�ٽ���arr1������arr2�ڲ�
		//�õ�һ����������ͬ�Ķ�������
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
	}
}
//���鷴ת
//����1���ҹ��ɵߵ�ǰ��
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
		System.out.println("����������Ϊ��");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

//����2������ֵ
//1.����һ���µ�����arr2��Сarr.length
//2.��arr�е�ÿ��Ԫ�ؿ�����arr2����
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
		//��arrָ��arr2����arr���൱��û��ʹ�þ�������
		System.out.println("��ת��");
		for(i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
	}
}
