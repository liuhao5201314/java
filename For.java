import java.util.Scanner;
public class For{
	public static void main(String[] args){
		//forѭ������
		int i=1;//���԰ѳ�ʼ��д������
		for(i=1;i<=10;i++){
			System.out.println("����");
		}
	}
}
//forѭ��ע��ϸ��
//��ʼ����ѭ������������
//for(,,)����ѭ��
//ctrl+c�˳�ѭ��
//ѭ���ж��������߿���ʡ�ԣ��м䲻����
//ѭ���ĳ�ʼֵ���Զ�����ʼֵ������Ҫ������һ�£��м��ö��Ÿ�����
//ѭ�������ĵ��������ж����м�Ҳ�Ƕ��Ÿ���
//�ȳ�ʼ�������жϣ���ѭ����������
//
class For1{
	public static void main(String[] args){
		int count = 3;
		int i=1,j=1;
		for(i=0,j=0;i<count;i++,j+=2){
			System.out.println("i="+i+"j="+j);//0,0/1,2/2,4/3�ͻ��˳�ѭ����

		}
	}
}

//����Ϊ��
//1.������1-100
//2.���˳�9�ı���i%9==0
//3.ͳ�Ƹ���
//4.�����ܺ�
//�������
//1.Ϊ����Ӧ��������ѷ�Χ��ɻ��
//2.��Ҫ��ı������ɱ���
class For2{
	public static void main(String[] args){
		int i=1;
		int j=0;
		int sum=0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������������һ����Χ��Ī���ı��������");
		System.out.println("��������ʼ��");
		int start=myScanner.nextInt();
		System.out.println("�����������");
		int end=myScanner.nextInt();
		System.out.println("��������Ҫ�ı���");
		int multiple=myScanner.nextInt();
		for(i=start;i<=end;i++){
			if(i%multiple==0){
				System.out.print(i+" ");
				j++;
				sum+=i;
			}
		}
		System.out.println("����"+j);
		System.out.println("��"+sum);
	}
}

class For3{
	public static void main(String[] args){
		int i=0;
		int j=0;
		for(i=0,j=5;i<=5&&j>=0;i++,j--){
			System.out.println(i+"+"+j+"="+(i+j));
		}
	}
}
//����Ϊ��
//1.���0-5
//2.�������ֿ�����5-i���
//�������
class For4{
	public static void main(String[] args){
		int n =5;
		for(int i=0;i<=n;i++){
			System.out.println(i+"+"+(n-i)+"="+n);
		}
	}
}


class For5{
	public static void main(String[] args){
		System.out.println("��������������˷���");
		int row=9;//��
		//int list=9;
		int i=1,j=1;
		for(j=1;j<=row;j++){
			for(i=1;i<=j;i++){
				System.out.print(i+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");
		}
	}
}