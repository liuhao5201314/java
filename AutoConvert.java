//һ�������������͵�ת��
//java�ڽ��и�ֵʱ������С�����ͻ��Զ�ת��Ϊ���ȴ���������ͣ��Զ�����ת����
//�������;���ת���ߣ�ֻ���ɵ͵��ߣ�
//char-->int-->long-->float-->double
//byte-->short-->int-->long-->float-->double
//int a = 'a';����
//double d = 80;����
public class AutoConvert{
	public static void main(String []args){
		int num = 'a';
		double d = 80;
		System.out.println(num);
		System.out.println(d);
	}
}
//������������ת��ע��ϸ��
//1.���ж����������ͻ������ʱ��ϵͳ�����Ȱ�������������ת��Ϊ������������Ȼ��������
//2.���ܰѴ�ľ��ȸ�������С��
class AutoConvert2{
	public static void main(String []args){
		int num = 10;
		float num2 = num + 1.1f;//10.0+1.1;
		}
}
//3.(bite,short)��char���ܽ����໥ת��
class AutoConvert3{
	public static void main(String []args){
		//�Ѿ�������ָ���byteʱ�����byte��Χ����ô�Ϳ���
		//��Ϊ���������ж��������Ƚ��з�Χ�ж��ٽ������͵��жϣ�������������û�г���byte��Χ
		byte b1 = 10;//��-128---127
		//�������ַ�ʽ�Ͳ����ԣ���Ϊ�����Ѿ���int���ˣ����ж������ͣ�
		// int n1 = 1;
		// byte n2 = n1;
		//char c1 = b1;//������byte��char����ת��
	}
}
//4.byte\short\char����֮����Խ������㣬����Ҫת��Ϊint
class AutoConvert4{
	public static void main(String []args){
		byte b2 = 1;
		short b1 = 1;;
		byte b4 = 2;	
		int b3 = b2 + b1;//�������ߵ�int
		int b5 = b2 + b4;//Ҳ������int����ʹ��byte
	}
}
//5.boolean���������͵��Զ�ת��
//6.���ʽ�������Զ�����Ϊ����������������
//
//����ǿ������ת��
//С����������������������ʧ
//
//�ġ�ǿ������ת��ϸ��
//1.ǿת����ֻ�������Ĳ�������Ч(int)(10*3.5+6*1.5)=44
//2.char���Ա���int�ĳ���ֵ���ܱ���int����ֵ
class AutoConvert5{
	public static void main(String []args){
		char c1 = 100;//��ȷ
		int m = 100;//��ȷ
		//char c2 = m;//����
		char c3 = (char)m;//��ȷ=d
		System.out.println(c3);
	}
}
//ǿ������ת����ϰ��
1.//��s-9Ϊint��
short s = 12;
s = s - 9;
2.//��b+11Ϊint
byte b = 10;
b = b + 11;
b = (byte)(b+11);
3.//��
char c = 'a';
int i = 16;
float d = .314f;
double sum = c+i+d;
4.//short��byte���������Ѿ�ת��Ϊ��Int
byte b = 16;
short s = 14;
short t = s+b;
