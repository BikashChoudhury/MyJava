public class ObjClassCheck{
	static void print(Object...obj){
				System.out.println(obj.length);
	if(obj.length==1){System.out.println("Here the length of array is 1 that means the obj[0] has got an encapsulated ayyay .");}
		System.out.println("Object...:" + obj[0] );
	}
	
	public static void main(String args[]){
	print("9","1","5");
	print(9,1,5);
	print(new int[] {9,1,5});
	print (new Integer[] {9,1,5});
	print(new String[] {"9","1","5"});
	print(new Object[] {"9","1","5"});
	}
}