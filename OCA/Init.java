public class Init{
	String title;
	boolean published;
	
	static int total;
	static double maxPrice;
	
	public static void main(String args[])
	{
		Init I=new Init();
		double price ;
		if(true)
			price=100.00;
		
			System.out.println("|"+I.title +"|" + I.published + "|" + Init.total + "|" + Init.maxPrice + "|" + price + "|\nargs Length = " + args.length);
	}
}