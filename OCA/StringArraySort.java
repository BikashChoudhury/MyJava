import java.util.Arrays;

public class StringArraySort{

	static int a=5;
	public static void main(String []args)
	{

		int a=6;
			System.out.println("\n\n Can Static int variable can be reassigned ?");
			System.out.println(a);
			System.out.println(StringArraySort.a+"\n\n");

			System.out.println("Can an array of string be sorted ?");

		String str[]= {"A","Z","G"};

		try{
		Arrays.sort(str);
		}
		catch(Exception E)
		{
			System.out.println("Cought Exception");
		}
		for(String s:str){
//			for(String s1:s){
				System.out.println(s);
//			}
		}
	}
}