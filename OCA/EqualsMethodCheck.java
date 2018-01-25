class Bikash{
	String str;
	Bikash(String str){
		this.str=str;
	}
	public String toString(){
//		System.out.println(str);
		return str;
	}
	public boolean equals(Bikash B){
		if((this.str).equals(B.str))
			return true ;
		else return false;
	}
}

public class EqualsMethodCheck{
	public static void main(String args[])
	{
		String a="Bikash";
		String b="Bikash";
		String c=new String("Bikash");
		
		if(a==b)		System.out.println("a==b Referance checking");
		if(a.equals(b)) System.out.println("a.equals(b) Content checking");

		System.out.println("--------------------------------");
		

		if(a==c)		System.out.println("a==c Referance checking");
		if(a.equals(c)) System.out.println("a.equals(c) Content checking");
		
		System.out.println("--------------------------------");


		Bikash A=new Bikash("Bikash");
		Bikash B=new Bikash("Bikash");

System.out.println("A.Str="+ A.str + "\n B.str=" + B.str);

		if(A==B)		System.out.println("A==B Referance checking"); 		else			System.out.println("A!=B");
		if(A.equals(B)) System.out.println("A.equals(B) Content checking"); else			System.out.println("A.notequals(B)");
	}
}