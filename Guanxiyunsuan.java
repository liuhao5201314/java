public class Guanxiyunsuan{
	public static void main(String[] args){
		//����ע��
		/*����ע�ͣ�������Ƕ��ʹ�ã�*/
		//��ϵ�����
		//��ϵ���������������Ϊboolean����Ҫôtrue/false
		//==Ϊ�Ƚ������
		int a = 9; //�Ϻ���ʾ: �����У�������ʹ�� a, b
		int b = 8;
		System.out.println(a > b); //T
		System.out.println(a >= b); //T
		System.out.println(a <= b); //F
		System.out.println(a < b);//F
		System.out.println(a == b); //F
		System.out.println(a != b); //T
		boolean flag = a > b; //T
		System.out.println("flag=" + flag);
	}
}