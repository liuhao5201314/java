public class Guanxiyunsuan{
	public static void main(String[] args){
		//单行注释
		/*多行注释（不允许嵌套使用）*/
		//关系运算符
		//关系运算符的运算结果都为boolean类型要么true/false
		//==为比较运算符
		int a = 9; //老韩提示: 开发中，不可以使用 a, b
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