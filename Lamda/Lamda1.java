public class Lamda1{
	public static void main(String args[])
	{
		StringLengthLamda MyLamda= (String S) -> S.length();
		System.out.println("The length of string is " + MyLamda.getLength("Bikash"));
	}

	interface StringLengthLamda{
		int getLength(String s);
	}
}