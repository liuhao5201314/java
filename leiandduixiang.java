import java.util.Scanner;
import java.util.Arrays;
public class leiandduixiang{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������Сè����");
		String name = input.next();//����ַ���
		if(name.equals("С��")){
			System.out.println("С�ף�3�꣬��ɫ");
		}else if(name.equals("С��")){
			System.out.println("С����100�꣬��ɫ");
		}else{
			System.out.println("������û����ֻСè");
		}
	}
}
//1.��һ�����������  //ȱ�㡤1����̫��
//2.��һ�����齫����ȫ������  //ȱ�����������Ψһ�����string�Ͳ��ܽ��иı�ֻ��ͨ��
//������±�ķ�ʽ��ȡ��Ϣ��������ݺ����ֲ���
//3.�������
//����һ��è��
//
class leiandduixiang1{
	public static void main(String[] args){
		Cat cat1=new Cat();//new Cat()����һ��è  Cat cat1=new Cat()��������è��ֵ��cat1
		cat1.name="С��";
		cat1.age=3;
		cat1.color="��ɫ";
		Cat cat2=new Cat();
		cat2.name="С��";
		cat2.age=100;
		cat2.color="��ɫ";
		System.out.println("��һֻè��Ϣ"+cat1.name+" "+cat1.age+" "+cat1.color);
		System.out.println("�ڶ�ֻè��Ϣ"+cat2.name+" "+cat2.age+" "+cat2.color);
	}
}
class Cat{
	String name;
	int age;
	String color;
}