import java.util.Scanner;
public class Break1{
	public static void main(String[] args){
		int i=1;
		int sum=1;
		int count=1;
		labe:for(i=1;i<=100;i++){
			count = (int)(Math.random()*100+1);//����10�����1-100������
			System.out.println(count);
			if(count!=97){
				sum++;
			}
			else{
				break labe;
			}
		}
		System.out.println("��"+sum);
	}
}

//Math.random()���0.0-1.0���ֵ
//����ʹ�ñ�ǩָ���˳��ض�ѭ�������û��ָ����Ĭ���˳����ѭ����
//������Ҫʹ�ñ�ǩ
//j=0-i=0-i=1-i=2�˳�
//���i=0��i=1
class Break2{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		int end=20;
		for(i=1;i<=100;i++){
			sum+=i;
			if(sum>end){
				break;
			}
		}
		System.out.println("���һ����Ϊ"+i);
	}
}

class Break3{
	public static void main(String[] args){
		System.out.println("���һ��������");
	    String sys = "ѧ����Ϣ����";
	    System.out.println("��ӭ���롶" + sys + "��ϵͳ");
	    System.out.println("������һ������Ա���룺");
	    Scanner input = new Scanner(System.in);//����һ���±�������
	    String name = input.next();//�����û���
	    String pass = input.next(); // ��������
	    System.out.println("�ظ�����Ա���룺");
	    String pass1 = input.next(); // ȷ������
	    if (pass.equals(pass1)) { // �Ƚ���������
	        System.out.println("����Ч�����μ����룺" + pass);
	    } else {
	        System.out.println("�������벻һ�£����������á�");
	    }
	}
}

class Break4{
	public static void main(String[] args){
		System.out.println("���һ��������");
	    String sys = "ѧ����Ϣ����";
	    System.out.println("��ӭ���롶" + sys + "��ϵͳ");
	    Scanner input = new Scanner(System.in);//����һ���±�������
	    System.out.println("������һ������Ա�û�����");
	    String name = input.next();//�����û���
	    System.out.println("������һ������Ա���룺");
	    String pass = input.next(); // ��������
	    System.out.println("��ӭ���¼������������������û������룺");
	    int j=0;//��¼�������
	    int k=0;
	    int i=1;//��¼�����������
	    for(i=1;i<=3;i++){
	    	System.out.println("�������û�����");
		    String name1 = input.next();//ȷ���û���
		    System.out.println("���������룺");
		    String pass1 = input.next(); // ȷ������
		    if (name.equals(name1)){ // �Ƚ�
		    	if (pass.equals(pass1)){
			        System.out.println("��¼�ɹ���" + name+pass);
			        break;
		   	 	}
		   	 	else {
		   	 	j++;
		        System.out.println("������û�����������������"+"�㻹��"+(3-j)+"�λ���");
		    	}
		    } 
		    else{
		    	j++;
		        System.out.println("�û�����������������"+"�㻹��"+(3-j)+"�λ���");
		    }
		}
		if(i==4){
			System.out.println("���Ѿ���������������Σ������Զ�����");
		}
	}
}