public class Shujuleixing{
	public static void main(String[] args){
		int n1 = 1;
		//int n2 = 1l;//long�Ͳ��ܷ���int
		long n3 = 1l;
		//float n4 = 1.1;//double���ܴ���float
		float n5 = 1.1f;
		double n6 = 1.1;
		double n7 = 1.1f;//����
		double n8 = 2.7;
		double n9 = 8.1 / 3.0;//
		System.out.println(n8);
		System.out.println(n9);
		//����д��(�����ǲ��������ͬ�ģ�С������ҪС��)
		if(n8 == n9){
			System.out.println("��ͬ");
		}
		System.out.println(Math.abs(n8 - n9));
		//��ȷд��ctrl+/����ע��
		if(Math.abs(n8 - n9)<0.0000001){//��ֵ�ǳ�С���涨����
			System.out.println("��ͬ");
		}
	}
}
//java�������ͷ�Ϊ1.�����������ͣ���ֵ�� ������byte[1]\short[2]\int[4]\long[8]
//                                    С����float[4]\double[8]
//                              �ַ��� char[2]��ŵ����ַ�'a',c����charΪ1�ֽ�
//                              ������ boolean ���turn false     
//                              
//               2.�����������ͣ��ࣨclass��---String
//                              �ӿڣ�interface��               
//                              ���飨[]��
//                              
//java�������͵�ʹ��
//byte n1=10;//ָ�����ݿռ�Ϊ1�ֽ�-128~127
//short n2=10;//�ռ䲻ͬ                              
//int
//long
//
//java����ϸ��
//java���й̶��ķ�Χ���ֶγ��ȡ����ܲ���ϵͳ��Ӱ��
//java�����ͳ���Ĭ��ֵΪint������Long�ͳ��������ں������'l'/'L'
//byte n1=3;  0000 0011(��һλΪ����λ)
//short n2=3; 0000 0000 0000 0011
//
//java�������͵�ʹ��
//float(����λ+ָ��λ+β��λ)��С����Ϊ����ֵ����β��λ���׶�ʧ��
//double
//
//java��������ϸ��
//java��������Ĭ��Ϊdouble����floatʱҪ�ں������'f'/'F'
//�����ͱ�ʾ����1.ʮ������ʽ
//             2.��ѧ������5.12e2[5.12*100]  5.12e-2[5.12/100]
//���Ƕ���������ΪС�����ж�ҪС��
//Ӧ���Զ�������ֵ�ľ���ֵ��Ī����Χ�ڽ����ж�
//���С����ֱ�Ӹ�ֵ�Ϳ��Խ����ж����
//
//
//java��API�൱��c�Ŀ⺯��
//https://www.matools.com/api
//JDK8,11----��----��----�ֶ�
//                 �ӿ�--������
//                 �쳣--��Ա����