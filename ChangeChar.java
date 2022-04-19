//java转义字符

public class ChangeChar
{
	//编写一个main方法
	public static void main(String[] args)
	{
		//\t:一个制表位，实现对齐功能
		System.out.println("北京\t天津\t上海\t重庆");
		//\n换行符
		System.out.println("jack\nsmith\nmary");
		//输出'\'要输入\\
		//输出'\\'要输入\\\\
		System.out.println("jack\\smith\\mary");
		System.out.println("jack\\\\smith\\\\mary");
		//输出':输入\'
		//输出":输入\"
		System.out.println("\'jack\'smithmary");
		System.out.println("\"jacks\"mithmary");
		//\r:一个回车   遇见\r光标会置顶然后再进行打印
		System.out.println("刘浩在干嘛\r重庆");
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
	}
}
//在控制台使用tab会自动补齐文件名
//java常见的错误
//1.找不到文件  打开cmd路径不对或者自己输入的文件名称错误
//2.类XXXXXXXX是公共的   文件名和公共类不匹配
//3.缺少分号
//4.非法字符   GBK没有转换或者中英文混淆
//5.业务错误和环境错误