import java.util.Scanner;
public class Homwork{
	public static void main(String[] args){
		//100 000 ����һ��·�ڽ�˰
		//>50 000��5%
		//<50000��1000
		int i = 0;
		double money=100000;
		while(true){
			if(money>50000){
				money=money-money*0.05;//==money*=0.95���ж���Ǯ
				i++;
			}
			else{
				money=money-1000;
				i++;
			}
			if(money<1000){
				System.out.println("������"+i+"��·�ڣ�����"+money+"Ǯ");
				break;
			}
		}
	}
}

//Math.pow(a,b)����ٴη���a^b
class Homwork1{
	public static void main(String[] args){
		//�ж�һ�����Ƿ�Ϊˮ�ɻ���
		System.out.println("������һ�����ֽ����ж��Ƿ�Ϊˮ�ɻ���");
		Scanner myScanner = new Scanner(System.in);
		int i=myScanner.nextInt();
		int ge=1;
		int shi=1;
		int bai=1;
		bai=i/100;//213/100=2
		shi=i/10%10;//213/10=21%10=1   shi=i%100/10
		ge=i%10;//213/10=3
		if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){//Math.cbrt(bai)+Math.cbrt(shi)+Math.cbrt(ge)
			System.out.println("Ϊˮ�ɻ���");
		}else{
			System.out.println("��Ϊˮ�ɻ���");
		}
	}
}

class Homwork2{
	public static void main(String[] args){
		System.out.println("������һ�����ֽ����жϴ�С");
		Scanner myScanner = new Scanner(System.in);
		int i=myScanner.nextInt();
		if(i>0){
			System.out.println("����0");
		}
		else if(i<0){
			System.out.println("С��0");
		}else{
			System.out.println("����0");
		}
	}
}


class Homwork3{
	public static void main(String[] args){
		System.out.println("������һ����ݽ����ж��Ƿ�Ϊ����");
		Scanner myScanner = new Scanner(System.in);
		int year=myScanner.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println("Ϊ����");
		}else{
			System.out.println("��Ϊ����");
		}
	}
}


class Homwork4{
	public static void main(String[] args){
		//�հ�
		int m=0,n=3;
		if(m>0){
			if(n>2)
				System.out.println("ok1");
			else
				System.out.println("ok2");
		}
	}
}


class Homwork5{
	public static void main(String[] args){
		//���1-100���ܱ�5��������5��һ��
		int i=1;
		int row=0;
		for(i=1;i<=100;i++){
			if(i%5!=0){
				row++;
				System.out.print(i+"\t");
				if(row%5==0){
					System.out.print("\n");
				}
			}
		}
	}
}


class Homwork6{
	public static void main(String[] args){
		int i=65;
		for(i=65;i<=90;i++){
			System.out.print((char)i+" ");
		}
		System.out.print("\n");
		for(i=97;i<=122;i++){
			System.out.print((char)i+" ");
		}
	}
}

class Homwork7{
	public static void main(String[] args){
		int i=1;
		double n=1.0;
		double sum=0.0;
		for(i=1;i<100;i++){
			if(i%2==0){
				sum+=-1.0/i;
			}else{
				sum+=1.0/i;
			}	
		}
		System.out.print(sum);//double
	}
}

class Homwork8{
	public static void main(String[] args){
		int i=1;
		int j=1;
		int sum1=0;
		int sum=0;
		for(j=1;j<=100;j++){
			for(i=1;i<=j;i++){
				sum1=sum1+i;
			}
		sum=sum+sum1;
		}
		System.out.print("����Ϊ"+sum);
	}
}