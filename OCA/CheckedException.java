public class CheckedException{
	public static void main(String []args)throws ClassNotFoundException , java.io.IOException
	{
		new CheckedException().method1();
		new CheckedException().method2();
	}
	
	
	static void method1()throws ClassNotFoundException
	{
		throw new ArithmeticException();
	}
	
	static void method1()throws java.io.IOException
	{
		throw new ArithmeticException();
	}
}