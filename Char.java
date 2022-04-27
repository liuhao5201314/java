//字符型的使用(2个字节)
public class Char{
	//编写一个main方法
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '刘';//21016
		char c4 = 97;//字符类型输出数字时会输出数字对应的字母
		char c5 = '9';//字符类型输出单引号内最大为9
		// char c1 = 97;
		// char c2 = 'a';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//ctrl shift d复制光标所在行
		                       //ctrl shift k删除所在行
		                       //注意对快捷键进行修改时要除最后一行不加,其余行需要加上,	

		System.out.println(c4);//输出数字对应的字符
		System.out.println(c5);//输出数字对应的字符

		System.out.println((int)c3);//int转化为整数  
		System.out.println('a' + 10);        
	}
}
//字符细节
//1.字符常量用''
//2.转义字符'\n'代表一个字符，
//3.char的本质是一个整数，每一个字符都会对应一个整数编码，在输出时会按照对应的unicode字符输出
//4.给char赋值整数会输出对应的unicode字符
//5.char可以参与运算
//
//字符类型的本质
//字符型存储到计算机的过程
//'a'-->码值97-->二进制-->存储
//读取过程
//二进制-->97-->'a'-->显示
//
//字符编码
//ASCLL编码，一个字节表示，128个字符，可以表示256只用128
//Unicode编码表，二个字节，字母和汉字都占用二个字节
//utf-8编码表，字母占一个字节，汉字用3个字节
//gbk编码表，字母占一个字节，汉字占2个字节
//gb2312表示范围小<gbk
//big5码（存放繁体字）