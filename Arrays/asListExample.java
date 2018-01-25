// Java program to demonstrate asList()
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class asListExample
{
	public static void main(String[] args)
	{
		Integer ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

		// Creates a wrapper list over ar[]
		List<Integer> l1 = Arrays.asList(ar);

			System.out.println("Before sorting :" + l1);

		Collections.sort(l1);
		
		System.out.println("After sorting :" + l1);
		
		for(int a:ar){
			System.out.println(a);
		}
	}
}
