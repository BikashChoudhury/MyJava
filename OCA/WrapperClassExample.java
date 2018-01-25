import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample{
	public static void main(String args[])
	{
		List<Integer> A=new ArrayList<Integer>();
		
		A.add(5);
		A.add(6);
		A.add(7);
		A.add(8);
		A.add(9);
		A.remove(0);
		
		A.forEach(S -> System.out.println(S));
	}
}