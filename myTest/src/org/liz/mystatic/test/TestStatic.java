package org.liz.mystatic.test;

public class TestStatic {

	/*public static int a = 1;
    public static int b = 3;
    public static String str;

    static {
        str = "i am here";
        a = 10;
        b = 30;
    }*/

	static {
        str = "i am here";
        a = 10;
        b = 30;
    }
	
	public static int a = 1;
    public static int b = 3;
    public static String str;
    
    public static void main(String[] args) {
        System.out.println(TestStatic.str);
        System.out.println(TestStatic.a);
        System.out.println(TestStatic.b);
    }
}
