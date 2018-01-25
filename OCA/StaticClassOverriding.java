class A{
	int a;
	public static void abc(){
		System.out.println("A static");
	//	this.a=a;
	} 

	public void ns(){
		System.out.println("A Non-static");
	} 

}

class B extends A{
	public static void abc(){
		System.out.println("B static");
	} 

	public void ns(){
		System.out.println("B Non-static");
	} 

}

public class StaticClassOverriding{
	public static void main(String []args)
	{
		A a= new B();
		a.abc();
		A.abc();
		a.ns();

		System.out.println("----------------------");

		B b= new B();
		b.abc();
		B.abc();
		b.ns();
		

	}
}