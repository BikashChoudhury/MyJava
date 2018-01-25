class Lamda2{
	public static void main(String args[])
	{
		greetingFunction = () -> System.out.println("Hello world");

		doubleNumber = (int a) -> a*2;

		addNumber = (int a, int b) -> a+b;

		safeDevision = (int a, int b) -> {
			if(b==0) return 0;
			else return a/b ;
		}
		stringLength = (String str) -> str.length();
 	}
}