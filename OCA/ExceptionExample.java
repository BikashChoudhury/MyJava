import java.lang.ArithmeticException;

public class ExceptionExample
{
	public static void main(String args[])
	{
//				int a=5,b=0,c;
//				c=a/b;

 		try {
				int a=5,b=0,c;
				c=a/b;
			}

			catch(ArithmeticException E)
			{
				System.out.println("ArithmaticException");				
			}
			
			catch(Exception E)
			{
				System.out.println("Exception");
			}
			
			catch(Throwable E)
			{
				System.out.println("Exception");
			}
	}
}