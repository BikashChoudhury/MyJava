public class InstanceOfVSGetClass{

public static void main(String []args){
	Object  str = new Integer("2000");

	long starttime = System.nanoTime();

	if(str instanceof String) {
		System.out.println("its string");
	} else {
		if (str instanceof Integer) {
			System.out.println("its integer");

		}
	}

	System.out.println((System.nanoTime()-starttime));

starttime = System.nanoTime();

	if(str.getClass() == String.class) {
		System.out.println("its string in equals");
	} else {
		if(str.getClass() == Integer.class) {
			System.out.println("its integer");
		}
	}

	System.out.println((System.nanoTime()-starttime) + "\n" + str.getClass());
}
}