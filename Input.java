import java.util.Scanner;//�����java.util����İ�Scanner
public class Input{
	public static void main(String[] args){
		//��������ĸ��д
		//�������ڶ�����ĸ��ʼ��д
		//������ȫ��д
		//��ʾ�����û�������  ��--����
		//1.����Scanner��
		//2.����һ��Scanner����
		//3.�����û�����
		Scanner myScanner = new Scanner(System.in);//2
		System.out.println("����������");
		String name = myScanner.nextString();//3.����һ���û�������ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();//3.����һ���û�������ַ���
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();//3.����һ���û�������ַ���
		System.out.println("�˵���Ϣ���£�");
		System.out.println("����="+name+"����="+age+"нˮ="+sal);
	}
}