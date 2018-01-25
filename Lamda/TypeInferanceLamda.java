public class TypeInferanceLamda{
	public static void main(String args[]){

		LamdaLength len = (String s) -> s.length();
		System.out.println( "Length of the string is : " + len.getLength("Bikash"));		

//		System.out.println( "Length of the string is : " + printLamda(s-> s.length()));

	}
	
//	static int printLamda(LamdaLength l){
//	return l.getLength("BIKASH");
//	}
	
	interface LamdaLength{
		public int getLength(String s);
	}
}