class SuperClass
{
	int a=10;
	static int b=20;
	public static class SubClass
	{
		void OuterNonStatic(SuperClass S)
		{
			System.out.println("\nOuter Non-Static variable");
			System.out.println(S.a);
		}
		void OuterStatic()
		{
			System.out.println("\nOuter Static variable");
			System.out.println(b);
		}
	}

	SubClass Sub=new SubClass();
}

public class InnerStaticClass
{
	public static void main(String args[])
	{
		SuperClass Sup=new SuperClass();
	//	int SM=Sup.Sub.OuterNonStatic();
		Sup.Sub.OuterStatic();
	//	System.out.println(SM);
		Sup.Sub.OuterNonStatic(Sup);
	}
}