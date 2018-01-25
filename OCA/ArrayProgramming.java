import java.util.Arrays;

public class ArrayProgramming{
	public static void main(String args[])
	{
		int a[]=new int[6];
		
		a=new int[] {1,2,6,5,3,4,8,7,9};
		System.out.println(a.length);

		Arrays.sort(a,3,6);
		
		System.out.println("Hashcode of the array "+a);

		System.out.println("Values in the array : ");
		
		for(int b: a)
		{
			System.out.println(b);			
		}
	}
}