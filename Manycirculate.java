import java.util.Scanner;
public class Manycirculate{
	public static void main(String[] args){
		//���ѭ������
		//������Ҫ����3��ѭ��
		//�ڲ�ѭ�������������ѭ����ֱ�����ѭ������
		//Ƕ��ѭ�����ǰ��ڲ�ѭ���������ѭ����ѭ����
		//
		int i=0;
		int j=0;
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.println("i="+i+"j="+j);//i=0 j=0 
												  //i=0 j=1
												  //i=0 j=2
												  //i=0 j=3--��ȥ
												  //i=1 j=0
												  //i=1 j=1
												  //i=1 j=2
												  //i=1 j=3--��ȥ
												  //i=2--�˳�ѭ��
												  //���i=0 j=0 i=0 j=1 i=0 j=2
												  //    i=1 j=0 i=1 j=1 i=1 j=2
			}
		}
	}
}

//����Ϊ��
//1.ͳ��һ���༶�ɼ�
//2.�õ��ð༶ƽ���֣�����һ������ͳ�ư༶�ɼ�
//3.ͳ�������༶�ĳɼ�
//4.������а༶ƽ����
//5.ͳ�Ƽ�������
//6.�����Ż�Ч�ʣ��ɶ��ԣ��ṹ
//����Ϊ��
//1.���༶��������Ա������ɱ���
class Manycirculate1{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������ͳ��3���༶ѧ����5��ƽ���ֺͼ�������");
		int i=1;
		int j=1;
		double sum=0;
		double sum1=0;
		double count=0;
		double count1=0;
		int tem=0;
		for(i=1;i<=3;i++){
			for(j=1;j<=5;j++){
				System.out.println("������"+i+"��"+"��"+j+"��ѧ���ɼ�");
				int student=myScanner.nextInt();
				if(student>60){
					tem++;
				}
				sum+=student;
			}
			count =sum/j;
			System.out.println(i+"�༶ƽ����Ϊ"+count);
			sum1+=count;
		}
		count1=sum1/i;
		System.out.println("�꼶ƽ����Ϊ"+count1);
		System.out.println("�꼶��������"+tem);
	}
}

//����Ϊ��
//1.��ӡ��һ��
class Manycirculate2{
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

class Manycirculate3{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������������������");
		System.out.println("���������������");
		int row=myScanner.nextInt();
		int i=1;
		int j=1;
		for(j=1;j<=row;j++){
			for(i=1;i<=j;i++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

class Manycirculate4{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������������ʵ�Ľ�����");
		System.out.println("���������������");
		int row=myScanner.nextInt();
		int i=1;//��ʾ��ǰ����*����
		int j=1;//��ʾ��ǰ�ڼ���
		int k=1;//��ʾ��ǰ�����ո�
		for(j=1;j<=row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			for(i=1;i<=(2*j-1);i++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

class Manycirculate5{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������������Ľ�����");
		System.out.println("���������������");
		int row=myScanner.nextInt();
		int i=1;//��ʾ��ǰ����*����
		int j=1;//��ʾ��ǰ�ڼ���
		int k=1;//��ʾ��ǰ�����ո�
		int m=1;//��ʾ�������ڲ��Ŀո���
		for(j=1;j<row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(i=1;i<=(2*(j-1)-1);i++){
				System.out.print(" ");
			}
			if(j>1){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i=1;i<=(2*j-1);i++){
			System.out.print("*");
		}
	}
}
//˼·����
//����Ϊ��
//1.�ȴ�ӡһ������
//2.��ӡ���������
//3.��ӡ����������,��������ո�
//��Ϊ2*j-1
//�ո�Ϊrow-j�ܲ���-��ǰ����
//4.������Ľ�����
//�ҹ���
//   *      ��ǰ�е���λλ��Ϊ*
//  * *     ��ǰ��λΪ*��1���ո�
// *   *    
//*******
//5.���ʹ�ܹ��ı����
class Manycirculate6{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������������ʵ�Ľ�����");
		System.out.println("���������������");
		int row=myScanner.nextInt();
		int i=1;//��ʾ��ǰ����*����
		int j=1;//��ʾ��ǰ�ڼ���
		int k=1;//��ʾ��ǰ�����ո�
		for(j=1;j<=row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			for(i=1;i<=(2*j-1);i++){
				if(i==1||i==(2*j-1)||j==row){//��Ϊ�׻�β�������һ�е�ʱ������*
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}


class Manycirculate7{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������������������");
		System.out.println("���������β���");
		int row=myScanner.nextInt();
		int i=1;//��ʾ��ǰ����*����
		int j=1;//��ʾ��ǰ�ڼ���
		int k=1;//��ʾ��ǰ�����ո�
		for(j=1;j<=row;j++){
			for(k=1;k<=(row-j);k++){
				System.out.print(" ");
			}
			for(i=1;i<=(2*j-1);i++){
				if(i==1||i==(2*j-1)){//��Ϊ�׻�β�������һ�е�ʱ������*
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(j=1;j<row;j++){
			for(k=1;k<=j;k++){
				System.out.print(" ");
			}
			for(i=1;i<=(row-j)*2-1;i++){
				if(i==1||i==((row-j)*2-1)){//��Ϊ�׻�β�������һ�е�ʱ������*
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}