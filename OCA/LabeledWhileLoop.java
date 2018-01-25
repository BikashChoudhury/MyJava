public class LabeledWhileLoop{
	public static void main(String args[]){

		int val=10;
		int i=0;
		myLoop :
		while(i<val)
		{
			if(i==4 || i== 10)
			{
				i++;
				continue myLoop;
			}
			System.out.print(i);
		i++;
		}
	}
}