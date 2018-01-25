class A  {
	static class BStatic {
		public void method(){
			System.out.println("Inner static class method called .");
		}
	}

	class BNormal {
		public void method(){
			System.out.println("Inner Normal class method called .");
		}
	}
	
	void method(){};
}

abstract class ABS{
	abstract void method();	
} 

public class InnerClassCheck{
	public static void main(String args[])
	{
		A.BStatic  InnerStatic= new A.BStatic();
		InnerStatic.method();
		
		A  Outer=new A ();
		A.BNormal  Inner= Outer.new BNormal();
		Inner.method();
		
		
		A Annonymous= new A(){
			int i=5,j=6;
			void method(){
			System.out.println("Annonymous class method called ."+ i+j );
			}
		};
		
		Annonymous.method();
		
		ABS abs1= new ABS();//This will give an error .
 
		ABS abs= new ABS(){
			void method(){
			System.out.println("Abstract class method called .");
			}			
		};
		abs.method();
	}
}