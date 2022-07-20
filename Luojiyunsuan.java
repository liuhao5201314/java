public class Luojiyunsuan{
	public static void main(String[] args){
		//单行注释
		/*多行注释（不允许嵌套使用）*/
		//逻辑运算符
		
		//短路与&&全真为真，短路或||一真为真，取反！
		//逻辑与&同真为真，逻辑或|一真为真，^逻辑异或不同为真
		//&&和&案件演示
		int age=50;
		if(age>30&&age<90){
			System.out.println("成立");//
		}

		if(age>30 & age<90){
			System.out.println("成立");//
		}

		//区别
		//&&当第一个为假就会停止判断跳出
		//&会对全部条件判断完成才会退出
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

		//|和||案件演示
		//二个条件一个成立就成立
		

		//区别
		//||第一个条件为真就会跳出判断
		//|二个都要判断完才会跳出判断
		
	}
}