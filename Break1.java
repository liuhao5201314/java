import java.util.Scanner;
public class Break1{
	public static void main(String[] args){
		int i=1;
		int sum=1;
		int count=1;
		labe:for(i=1;i<=100;i++){
			count = (int)(Math.random()*100+1);//生成10个随机1-100的数字
			System.out.println(count);
			if(count!=97){
				sum++;
			}
			else{
				break labe;
			}
		}
		System.out.println("第"+sum);
	}
}

//Math.random()输出0.0-1.0随机值
//可以使用标签指定退出特定循环，如果没有指定就默认退出最近循环体
//尽量不要使用标签
//j=0-i=0-i=1-i=2退出
//输出i=0，i=1
class Break2{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		int end=20;
		for(i=1;i<=100;i++){
			sum+=i;
			if(sum>end){
				break;
			}
		}
		System.out.println("最后一个数为"+i);
	}
}

class Break3{
	public static void main(String[] args){
		System.out.println("设计一个密码锁");
	    String sys = "学生信息管理";
	    System.out.println("欢迎进入《" + sys + "》系统");
	    System.out.println("请设置一个管理员密码：");
	    Scanner input = new Scanner(System.in);//建立一个新变量输入
	    String name = input.next();//设置用户名
	    String pass = input.next(); // 设置密码
	    System.out.println("重复管理员密码：");
	    String pass1 = input.next(); // 确认密码
	    if (pass.equals(pass1)) { // 比较两个密码
	        System.out.println("已生效，请牢记密码：" + pass);
	    } else {
	        System.out.println("两次密码不一致，请重新设置。");
	    }
	}
}

class Break4{
	public static void main(String[] args){
		System.out.println("设计一个密码锁");
	    String sys = "学生信息管理";
	    System.out.println("欢迎进入《" + sys + "》系统");
	    Scanner input = new Scanner(System.in);//建立一个新变量输入
	    System.out.println("请设置一个管理员用户名：");
	    String name = input.next();//设置用户名
	    System.out.println("请设置一个管理员密码：");
	    String pass = input.next(); // 设置密码
	    System.out.println("欢迎你登录本程序，请输入密码和用户名进入：");
	    int j=0;//记录错误次数
	    int k=0;
	    int i=1;//记录输入密码次数
	    for(i=1;i<=3;i++){
	    	System.out.println("请输入用户名：");
		    String name1 = input.next();//确认用户名
		    System.out.println("请输入密码：");
		    String pass1 = input.next(); // 确认密码
		    if (name.equals(name1)){ // 比较
		    	if (pass.equals(pass1)){
			        System.out.println("登录成功：" + name+pass);
			        break;
		   	 	}
		   	 	else {
		   	 	j++;
		        System.out.println("密码或用户名错误请重新输入"+"你还有"+(3-j)+"次机会");
		    	}
		    } 
		    else{
		    	j++;
		        System.out.println("用户名错误请重新输入"+"你还有"+(3-j)+"次机会");
		    }
		}
		if(i==4){
			System.out.println("你已经输入密码错误三次，程序自动上锁");
		}
	}
}