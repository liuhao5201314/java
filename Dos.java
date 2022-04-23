public class Comment{
	public static void main(String[] args){
		//单行注释
		/*多行注释（不允许嵌套使用）*/
	
	}
}
//相对路径和绝对路径(Dos系统)
//相对路径指从当前目录（文件所处的文件）开始定位，形成的一个路径
//绝对路径指从顶级目录（c/d/e/g），开始定位形成的路径
//从abc目录下的test100访问abc2文件下test200(下的hello.txt)
//相对路径：test100\abc\test5\abc2\test200\hello.txt（从当前文件夹出发访问上一级再进入到对应文件夹）
//绝对路径：g:\兴趣\java\text5\abc2\test200\hello.txt
//相对路径中（..\）表示上一级目录
//
//常见的Dos命令
//1.查看当前目录下有什么内容  dir(直接查看当前目录内容)/dir g:\abc2\test200（打出具体目录再进行查看）
//2.切换到其他盘  cd /D c:(切换到c盘)
//3.切换到当前盘的其他目录  cd g:\兴趣、java\test5\abc2(可以采用绝对路径/相对路径)
//4.切换到上一级目录：cd..
//5.切换到根目录：cd\(c/d/e/g盘)
//6.查看指定目录下所有的子级目录tree(直接查看文件树状图)    tree g:\abc2(展开指定文件目录树)
//7.清屏cls[苍]
//8.退出Dos  exit
//9.创建文件md
//10.删除目录rd
//11.拷贝文件copy            copy hello1.txt g:\兴趣\java\text5\abc\test100\hello2.txt
//12.删除文件del             del abc.txt 
//13.输入内容到文件echo      echo ok>hello.txt
//14.输入内容（一个空文件）   type   type nul>abc.txt
//15.剪切move                move hello1.txt g:\兴趣\java\text5\abc\test100\hello2.txt
//