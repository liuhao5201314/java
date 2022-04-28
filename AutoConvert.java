//一、基本数据类型的转换
//java在进行赋值时，精度小的类型会自动转化为精度大的数据类型（自动类型转化）
//数据类型精度转化线（只能由低到高）
//char-->int-->long-->float-->double
//byte-->short-->int-->long-->float-->double
//int a = 'a';成立
//double d = 80;成立
public class AutoConvert{
	public static void main(String []args){
		int num = 'a';
		double d = 80;
		System.out.println(num);
		System.out.println(d);
	}
}
//二、数据类型转化注意细节
//1.当有多种数据类型混合运算时，系统会首先把所有数据类型转化为最大的数据类型然后再运算
//2.不能把大的精度赋给精度小的
class AutoConvert2{
	public static void main(String []args){
		int num = 10;
		float num2 = num + 1.1f;//10.0+1.1;
		}
}
//3.(bite,short)和char不能进行相互转化
class AutoConvert3{
	public static void main(String []args){
		//把具体的数字赋给byte时如果在byte范围内那么就可以
		//因为对于数字判断我们是先进行范围判断再进行类型的判断，所有下面数字没有超过byte范围
		byte b1 = 10;//对-128---127
		//下面这种方式就不可以，因为数字已经是int型了（先判断了类型）
		// int n1 = 1;
		// byte n2 = n1;
		//char c1 = b1;//不可以byte和char不能转化
	}
}
//4.byte\short\char三者之间可以进行运算，首先要转化为int
class AutoConvert4{
	public static void main(String []args){
		byte b2 = 1;
		short b1 = 1;;
		byte b4 = 2;	
		int b3 = b2 + b1;//结果会提高到int
		int b5 = b2 + b4;//也必须用int不能使用byte
	}
}
//5.boolean不参与类型的自动转化
//6.表达式的类型自动提升为操作数中最大的类型
//
//三、强制类型转化
//小心造成数据溢出或者数据损失
//
//四、强制类型转化细节
//1.强转符号只针对最近的操作符有效(int)(10*3.5+6*1.5)=44
//2.char可以保存int的常量值不能保存int变量值
class AutoConvert5{
	public static void main(String []args){
		char c1 = 100;//正确
		int m = 100;//正确
		//char c2 = m;//错误
		char c3 = (char)m;//正确=d
		System.out.println(c3);
	}
}
//强制类型转化练习题
1.//错s-9为int型
short s = 12;
s = s - 9;
2.//错b+11为int
byte b = 10;
b = b + 11;
b = (byte)(b+11);
3.//对
char c = 'a';
int i = 16;
float d = .314f;
double sum = c+i+d;
4.//short和byte进行运算已经转化为了Int
byte b = 16;
short s = 14;
short t = s+b;
