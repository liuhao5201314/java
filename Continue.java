//��ת�������
//���ڽ�������ѭ��������ִ����һ��ѭ��
//Ҳ����ͨ����ǩ��������ĳ��ѭ��label
//ִ�е�continue�ͻ���ת��ѭ�����������´��ж�
import java.util.Scanner;
public class Continue{
	public static void main(String[] args){
		labe1:
		for(int j=0;j<4;j++){
			labe2:
			for(int i=0;i<10;i++){
				if(i==2){
					//continue labe1;
					continue;
				}
				System.out.println("i="+i);
			}
		}
	}
}

//�ڴ�j=0 i=0 i=1 i=2 j=1 i=0 
//���i=0 i=1 i=0 
//01010101
//�ڴ�j=0 i=0 i=1 i=2 i=3
//���i=0 i=1 i=3
//012456789*4