public class SwitchBlockTest{

		 final static int a=0;
		 final static int b=2;

	static public void main(String args[])
	{
		switch(a+b)
		{
//			case a : System.out.println("1"); Here it's not possible 
			case 1 : System.out.println("2");break;
			case 3 : System.out.println("3");
			case b : System.out.println("b=2");break;
			default: System.out.println("Default");
		}
	}
}