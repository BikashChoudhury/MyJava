class A{
	static void staticMethod(){
		System.out.println("Static method");
	}
	void NonstaticMethod(){
		System.out.println("Non Static method");
	}
}

public class B{
	public static void main(String []args){
		A a = null;
		
	//	a.staticMethod();
		a.NonstaticMethod();

	}
}