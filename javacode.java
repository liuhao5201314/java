public class javacode{
	public static void main(String[] args){
		//����ע��
		/*����ע�ͣ�������Ƕ��ʹ�ã�*/
		//���½��������������ʹ��
		System.out.println(10/4);//Ӧ��2.5//������java����int�����2
		System.out.println(10.0/4);//������Ĭ�ϱ���double����
		double d=10/4;//2.0
		double b=10.0/4;
		System.out.println(d);
		System.out.println(b);

		//%ȡģȡ��
		//ȡģ����a%b=a-a/b*b
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-10-��-10��/3*3=-10-��-9��=-1

		//++����
		//i++�ȸ�ֵ��++
		//++i��++�ٸ�ֵ
		//�������i++=++i
		int i=1;
		int a;
		int c;
		a=i++;
		System.out.println(a);//i=2,a=1
		c=++i;
		System.out.println(c);//i=3,c=3
	}
}

class Homework1{
	public static void main(String[] args){
		int i=1;
		i=i++;//temp=i--i=i+1--i=temp
		System.out.println(i);//i=1->i=1
	}
}

class Homework2{
	public static void main(String[] args){
		int i=1;
		i=++i;//i=i+1--temp=i--i=temp
		System.out.println(i);//i=1->i=2
	}
}

class Homework3{
	public static void main(String[] args){
		int i1=10;
		int i2=20;
		int i=i1++;//i=10--i1++=11
		System.out.println("i="+i);//10 println����ln����û�мӾͲ��ỻ��
		System.out.println("i2="+i2);//20
		i=--i2;//i2=19--i=19
		System.out.println("i="+i);//19
		System.out.println("i2="+i2);//19
	}
}

class Homework4{
	public static void main(String[] args){
		int i=59;
		int n;
		int m;
		n=i/7;
		m=i%7;
		System.out.print("����"+n+"����");
		System.out.println("��"+m+"��");
	}
}

class Homework5{
	public static void main(String[] args){
		double i=234.5;
		double h;
		h=5.0/9*(i-100.0);
		System.out.println(h);
	}
}