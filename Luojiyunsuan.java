public class Luojiyunsuan{
	public static void main(String[] args){
		//����ע��
		/*����ע�ͣ�������Ƕ��ʹ�ã�*/
		//�߼������
		
		//��·��&&ȫ��Ϊ�棬��·��||һ��Ϊ�棬ȡ����
		//�߼���&ͬ��Ϊ�棬�߼���|һ��Ϊ�棬^�߼����ͬΪ��
		//&&��&������ʾ
		int age=50;
		if(age>30&&age<90){
			System.out.println("����");//
		}

		if(age>30 & age<90){
			System.out.println("����");//
		}

		//����
		//&&����һ��Ϊ�پͻ�ֹͣ�ж�����
		//&���ȫ�������ж���ɲŻ��˳�
		int a=4;
		int b=9;
		if(a<1&&++b<50){
			System.out.println("ok");
		}
		System.out.println("b="+b);//9

		if(a<1&++b<50){
			System.out.println("ok");
		}
		System.out.println("b="+b);//10

		//|��||������ʾ
		//��������һ�������ͳ���
		

		//����
		//||��һ������Ϊ��ͻ������ж�
		//|������Ҫ�ж���Ż������ж�
		
	}
}