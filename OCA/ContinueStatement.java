public class ContinueStatement{
	static int x;
public static void main(String []args){
	int[] num={0,1,2,3,4};
	for (int x:num){
		System.out.println(x);
		continue ;
//System.exit(0);
			System.out.println(x+ContinueStatement.x);		
	}
}
}