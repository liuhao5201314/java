public class Sanyuanyunsuan{
	public static void main(String[] args){
		//��Ԫ�����
		//�������ʽ�����ʽ1�����ʽ2��
		//������ʽΪ�棬������Ϊ1
		//����������ʽΪ�٣�������Ϊ2
		int a=10;
		int b=99;
		int result=a>b?a++:b--;//result �ȸ�ֵ�ټ���result=99
		System.out.println("a="+a+"b="+b);

		//��Ԫ����ϸ��
		//���ʽ1��2ҪΪ���Ը������ձ���������
		int i=3;
		int j=4;
		double c=i>j?1.1:1.2;//�����ǲ����Ե�Ҫ��double
	}
}

class Homework{
	public static void main(String[] args){
		int a=10;
		int b=23;
		int c=5;
		int max1=a>b?a:b;
		int max2=max1>c?max1:c;

		int max2=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("���ֵ"+max2);
	}
}
//