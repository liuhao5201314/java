public class StringToBasic{
	public static void main(String[] args){
        //������������-��string
        int n1 = 100;
        float f1 = 1.1f;
        double d1 = 4.4;
        boolean b1 = true;
        String s1 = n1 + "";//n1+�ַ���ת��Ϊ��һ���ַ���
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " "+ s4 + " ");

        //string->������������
        String s5 = "121";
        int num1 = Integer.parseInt(s5);//IntegerΪһ���������parseIntΪ����
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(s5);

        System.out.println(num1);//121
        System.out.println(num2);//121.0
        System.out.println(num3);//121.0
        System.out.println(num4);//121
        System.out.println(num5);//121
        System.out.println(num6);//121
        System.out.println(b);//121

        //���ǽ�s5�ַ����ĵ�һ���ַ�1
        //�ַ���ת����Ϊ�ַ�char-�����ǽ��ַ�����һ���ַ��õ�
        System.out.println(s5.charAt(0));
	}
}