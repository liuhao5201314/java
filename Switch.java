import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
		//switch�ؼ���
		//case��--�����ǳ������������ʽ������Ϊ����������Ҫһ�£����߿����Զ�ת��Ϊ�໥�Ƚ�������char��int
		//switch����ķ���ֵ����Ϊ��byte,short,int,char,enum,String)
		//break�˳�switch
		//default����---ֱ��ִ��(����û��)
		//���жϵ�case�ͻ�ִ������ȫ���������û��break�������case�����ж�һֱִ�е�break����͸��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������a-g");
		char Tian = myScanner.next().charAt(0);
		switch(Tian){
			case 'a':
			System.out.println("����һ");
			break;
			case 'b':
			System.out.println("���ڶ�");
			break;
			case 'c':
			System.out.println("������");
			break;
			case 'd':
			System.out.println("������");
			break;
			case 'e':
			System.out.println("������");
			break;
			case 'f':
			System.out.println("������");
			break;
			case 'g':
			System.out.println("������");
			break;
			default:
			System.out.println("�������");
			break;
		}
	}
}


class Switch1{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������a-e");
		char Zhimu = myScanner.next().charAt(0);
		switch(Zhimu){
			case 'a':
				System.out.println("A");
			break;
			case 'b':
				System.out.println("B");
			break;
			case 'c':
				System.out.println("C");
			break;
			case 'd':
				System.out.println("D");
			break;
			case 'e':
				System.out.println("E");
			break;
			default:
				System.out.println("other");
		}
	}
}


class Switch2{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�");
		int score = myScanner.nextInt();
		if(score>0&&score<100){
			int tem=score/60;
			switch(tem){
				case 0:
					System.out.println("�ɼ����ϸ�");
				break;
				case 1:
					System.out.println("�ɼ��ϸ�");
				break;
			}
		}
		else{
			System.out.println("�ɼ���ʽ����");
		}
	}
}


class Switch3{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����뼾��");
		int seasons=myScanner.nextInt();
		switch(seasons){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
			break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
			break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
			break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
			break;
		}
	}
}