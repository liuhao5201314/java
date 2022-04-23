public class Homework01
{
	//编写一个main方法
	public static void main(String[] args)
	{
		System.out.println("Hello,word~");
	}
}

class Homework02
{
	public static void main(String[] args)
	{
		//转义字符使用
		System.out.println("姓名:\t刘浩\n性别:\t男\n籍贯:\t汉\n住址:\t重庆\n");
	}
}
//JDK和JRE、JVM的关系？
//JDK = JRE + java开发工具
//JRE = JVM + 核心类库
//
//环境变量path配置及其作用？
//1.环境变量的作用是为了在dos的任意目录去使用java/javac的命令
//2.先配置一个JAVA_HOME=指向jdk安装的主目录
//3.编辑path环境变量，增加%JAVA_HOME%\bin
//
//java编写步骤
//1.编写java源代码
//2.javac编译得到对应.class字节码文件
//3.java运行，把.class文件加载到jvm 运行
//
//
//java的规范7个
//
//