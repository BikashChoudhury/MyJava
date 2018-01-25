
import java.util.Arrays;

public class ArrayToString{
   public static void main(String[] args) {

      // initializing int array
      int[] i1 = new int[] { 33, 12, 98 };

      // let us print all the elements available in list
      System.out.println("The array is:");
      for (int number : i1) {
         System.out.println("Number = " + number);
      }
      
	  String S=Arrays.toString(i1);
	  
      System.out.println("The string representation of array is:");
      System.out.println(S);
   }
}
/*
public class ArrayToString{
	public static void main(String []args)
	{
		int a[]={1,2,3,4,5,6,7};
		String S=sendInt(a);
//		String str=a.toString();
		
		System.out.println(S);
	}
	String sendInt(String...a){
		String str=a.toString();
		return str;
	}
}
*/