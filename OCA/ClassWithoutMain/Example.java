import java.util.Scanner;

public class Example{
	public static void main(String args[]){
		Scanner inp= new Scanner(System.in);

		System.out.println("Enter the number :");	
		int n= inp.nextInt();
		Bikash B=new Bikash(n);
		System.out.println("The entered number is :"+B.Show());
	}
}