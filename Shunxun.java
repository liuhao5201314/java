import java.util.Scanner;
public class Shunxun{
	public static void main(String[] args){
		//if else
		//����֧
		//˫��֧
		//���֧
		//��дһ��˳��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		int shuzhi = myScanner.nextInt();
		if (shuzhi>18) {
			System.out.println("����");
		}
		else{
			System.out.println("δ����");
		}
	}
}
//˫��֧
//if--else
//
class Lianxi1{
	public static void main(String[] args){
		double a=10.5;
		double b=20.5;
		if (a>10.0) {
			if (b>20.0) {
				System.out.println(a+b);
			}
		}
	}
}

class Lianxi2{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��һ��������");
		int inPut = myScanner.nextInt();
		if (inPut%3==0) {
			if (inPut%5==0) {
				System.out.println(inPut);
			}
		}
		else{
			System.out.println("���ܱ�����");
		}
	}
}

class Lianxi3{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��һ�����");
		int nian = myScanner.nextInt();
		if ((nian%4==0&&nian%100!=0)||(nian%400==0)) {
				System.out.println("��������");
		}
		else{
			System.out.println("�ⲻ������");
		}
	}
}