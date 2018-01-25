import  java.lang.ArithmeticException;

public class CheckedExceptionExample{

	public static void main(String []args)
	{
		try{
			new CheckedExceptionExample().method1();
			new CheckedExceptionExample().method2();
		}
		catch(Exception E){
			System.out.println(E);
		}
	}

	static void method1()throws ClassNotFoundException
	{
		throw new ArithmeticException("Done");
	}

	static void method2()throws java.io.IOException
	{
		throw new ArithmeticException();
	}
}