import java.util.Scanner;
public class Qiantao{
	public static void main(String[] args){
		//ifǶ��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ�");
		double Chengji = myScanner.nextDouble();
		if (Chengji>8.0) {
			System.out.println("�������Ա�");
			char gender = myScanner.next().charAt(0);
			if(gender=='��'){
				System.out.println("����������");
			}
			else if (gender=='Ů') {
				System.out.println("����Ů����");
			}
			else{
				System.out.println("�������");
			}
		}
		else{
			System.out.println("�ɼ����ϸ�");
		}
	}
}


class Menpiao{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·�");
		int yue = myScanner.nextInt();
		if (yue>0&&yue<=12) {
			if(yue>=4&&yue<=10){
				System.out.println("����������");
				int age = myScanner.nextInt();
				if (age>=18&&age<=60){
					System.out.println("��������Ʊ60");
				}
				else if(age>0&&age<18){
					System.out.println("����δ����Ʊ30");
				}
				else if (age>60){
					System.out.println("��������Ʊ20");
				}
				else{
					System.out.println("�����������");
				}
			}
			else{
				System.out.println("����������");
				int age = myScanner.nextInt();
				if (age>=18&&age<=60){
					System.out.println("��������Ʊ40");
				}
				else{
					System.out.println("��������/δ����Ʊ20");
				}
			}
		}
		else{
			System.out.println("�������");
		}
	}
}