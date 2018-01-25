public class ArrayExamples{
	public static void main(String args[])
	{
			int arr[]=new int[0];

			System.out.println(arr.length); //Array of length 0
			
//			int a[][]= new int [][4];	//This will give error

			int []b[]= new int [4][5];
			int c[][]= new int [4][5];
			int []d[]= new int [4][];
			int [][]e= new int [4][5];

//			System.out.println(a.length); 
			System.out.println(b[0].length); 
			System.out.println(c[0].length); 
//			System.out.println(d[0].length); //This will give error
			System.out.println(e [0].length);
			
			int[] f[]={{1,2},{1},{},{1,2,3}};
			
			int g[] = new int[] {1,2};
			
			int h[][]=new int [][]{{1,2,3},{4,5,6}};
			
			int i[][]= {{1,2},new int[2]};
			
			int j[]= {1,2,3,4};

	}
}