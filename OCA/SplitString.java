public class SplitString
{
	public static void main(String []args)
	{
		String str="My name is bikash choudhury";
		
		String spl[]= str.split(" ");
		
		for(String s:spl)
		{
			System.out.print(s + ",");
		}
	}
}