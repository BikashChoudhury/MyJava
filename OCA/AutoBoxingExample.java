class A{
	void method(int i){
		System.out.println("A int");
	}
}

class B extends A{
	void method(Integer i){ 
		System.out.println("B integer");
	}
}

public class AutoBoxingExample{
	public static void main(String []args){
		A a=new A();
		a.method(new Integer(10));
		a.method(10);
		
		B b=new B();
		b.method(new Integer(10));
		b.method(10);
		
	}
}