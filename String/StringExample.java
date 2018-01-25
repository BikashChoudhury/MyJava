public class StringExample{
	static	String s9;

	public static void main(String args[])
	{
		String s1=new String("By using new operator");
		String s2="By using literals";
		
		String s3=new String(s1);
		
		char ch[]={'B','I','K','A','S','H','C','H','O','U','D','H','U','R','Y'};
		
		String s4=new String(ch);
		
		String s5=new String(ch,4,5);
		
		int a[]={65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
		
		String s6=new String(a,0,7);
		
		String s7;
		
		String s8=new String();
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println("s3=" + s3 +" And copy constructor .");
		System.out.println("s4=" + s4);
		System.out.println("s5=" + s5);
		System.out.println("s6=" + s6);
//		System.out.println("s7=" + s7);
		System.out.println("s8=" + s8);
		System.out.println("s9=" + s9);
	}
}