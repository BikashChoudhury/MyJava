public class RedKnight {

    static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        //  Print the distance along with the sequence of moves.
		int chess[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				chess[i][j]=0;
			}
		}
		
		chess[i_start][j_start]=1;     //own

		chess[i_start-1][j_start-2]=1; //UL
		chess[i_start+1][j_start-2]=1; //UR

		chess[i_start-1][j_start+2]=1;	//LL
		chess[i_start+1][j_start+2]=1;	//LR

		chess[i_start-2][j_start]=1; 	//L
		chess[i_start+2][j_start]=1;	//R
 		
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i_start = in.nextInt();
        int j_start = in.nextInt();
        int i_end = in.nextInt();
        int j_end = in.nextInt();
        printShortestPath(n, i_start, j_start, i_end, j_end);
        in.close();
    }
}