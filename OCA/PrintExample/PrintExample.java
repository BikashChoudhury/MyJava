import java.io.PrintStream;


class Print{

}

public class PrintExample
{
	public static void main(String []args) throws Exception {
		System.out.println("This is System.out" + System.out.getClass() + " OVER N OUT");
		
		PrintStream ps=new PrintStream("This is Object creation");
		
		ps.println("This is My class");

	}
}