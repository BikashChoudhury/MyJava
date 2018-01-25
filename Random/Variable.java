class Variable{
	static int x;
	int y;
	public static void main(String srgs[]){
	int n;
//	System.out.println("n value: " +n);//Error: variable n might not have been initialized
	System.out.println("x value: " +x);
//	System.out.println("y value: " +y);//Error : non-static variable y cannot be referenced from a static context
	}
}