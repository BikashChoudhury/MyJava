class Bikash{
	String str;
	Bikash(String str){
		this.str=str;
	}
	public void toString(){
		System.out.println(str);
	}
}

public class EqualsMethodCheck{
	public static void main(String args[])
	{
		String a="Bikash";
		String b="Bikash";
		String c=new String("Bikash");
		
		if(a==b)		System.out.println("a==b");
		if(a.equals(b)) System.out.println("a.equals(b)");

		if(a==c)		System.out.println("a==c");
		if(a.equals(c)) System.out.println("a.equals(c)");
		
		Bikash A=new Bikash("Bikash");
		Bikash B=new Bikash("Bikash");

		if(A==B)		System.out.println("A==B");
		if(A.equals(B)) System.out.println("A.equals(B)");
	}
}