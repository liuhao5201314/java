//do{
//	ѭ����
//	ѭ����������
//}while(ѭ������);
//��ִ�����жϣ�һ����ִ��һ��
//
//����˵�������ʾһ�ε����
//ѭ��������ʼ��--ѭ����---ѭ������---ѭ���ж�
//ѭ����������Ϊһ������ֵ���ʽ
//
import java.util.Scanner;
public class Dowhile{
	public static void main(String[] args){
		int i=1;
		do{
			System.out.println("liuhao"+i);
			i++;
		}while(i<=10);
	}
}


class Dowhile1{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		int end=100;
		do{
			System.out.print(i+" ");
			sum+=i;
			i++;
		}while(i<=end);
		System.out.println("��="+sum);
	}
}
//����Ϊ��
//����Χ�͸�ֵ���иı�
class Dowhile2{
	public static void main(String[] args){
		int i=1;
		int end=200;
		do{
			if(i%5==0&&i%3!=0){
				System.out.println(i);
			}
			i++;
		}while(i<=end);
	}
}

//�ַ����Խ��бȽ�
//�ַ������бȽ�Ҫ���ú������жԱ����
class Dowhile3{
	public static void main(String[] args){
		char tem=' ';
		Scanner myScanner = new Scanner(System.in);
		do{
			System.out.println("��Ը������ش�Y/N");
			tem = myScanner.next().charAt(0);
			System.out.println("��Ļش�˵"+tem);
		}while(tem!='Y');
		System.out.println("��ϲ��");
	}
}