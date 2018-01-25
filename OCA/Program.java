import java.util.Arrays;

public class Program{
	public static void main(String []args)throws java.lang.InterruptedException
	{
		String[] s={"Name","Large","nose","Onion","Sound"};
		Arrays.sort(s);
		for(String ss:s)
		{
			System.out.println(ss);
		}

		
		int i[];
		i=new int[] {1,2,3,4,5};

			System.out.println(i.hashCode() + i.toString());
			
		for(int ss:i)
		{
			System.out.println(ss);
		}

		s=new String[] {"N","L","n","O","S"};
		Arrays.sort(s);

//		String[] s1={"N","L","n","O","S"};
//		Arrays.sort(s1);

		for(String ss:s){
			System.out.println(ss);
		}
	}
}