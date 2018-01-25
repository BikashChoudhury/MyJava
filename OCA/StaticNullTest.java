class A{
	static void staticMethod(){
		System.out.println("Static method");
	}
	void staticMethod(){
		System.out.println("Non Static method");
	}
}

public class StaticNullTest{
	public static void main(String []args){
		A a = null;
		
	//	a.staticMethod();
		a.NonstaticMethod();

	}
}