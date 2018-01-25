public class ObjectToLong{
	public static void main(String args[])
	{
 		long[][] I2d;
		long []I1d={1,2,3};
		
		Object o=I1d;
		I2d =new long[3][3];

//		I2d[0][0] = (long[])o;	1 dimensional Object can't be converted to 2D long value . 

		for(int i=0;i<3;i++){
			I2d[0][i]=I1d[i];
		}
		
			for(long L : I2d[0]){
				System.out.println(L);
			}

		I2d =new long[3][3];

			System.out.println("--------------------------------------");
		
		for(long L : I2d[0]){
			System.out.println(L);
		}

		I2d[0] = (long[])o;

			System.out.println("--------------------------------------");

		for(Object L : I2d[0]){
			System.out.println(L);
		}

//		Object can't be converted to long implicitely .

//		I2d[0] = o;
//			for(Object L : I2d[0]){
//			System.out.println(L);
//		}
		
	}
}