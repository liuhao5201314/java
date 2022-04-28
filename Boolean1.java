//布尔类型boolean
//占用空间为1个字节，只允许true,false
//判断真假if/循环
//不能用0或者非0来表示真假和c语言不同
public class Boolean1{
	//编写一个main方法
	public static void main(String[] args){
		//判断成绩是否通过
		boolean ispass = false;
		if(ispass == true){//等号为赋值，双等号才是等号判断
			System.out.println("考试通过");
		}else{
			System.out.println("没有通过继续加油");
		}
	}
}