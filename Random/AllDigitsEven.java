public class AllDigitsEven{
	public static void main(String args[])
	{
		int j=1000,count=0;

		while(j!=9999)
		{
			int i=j;
			if(i%2==0)
			{
				int n4=i%10;
				i=i/10;
				if(i%2==0)
				{
					int n3=i%10;
					i=i/10;
						if(i%2==0)
						{
							int n2=i%10;
							i=i/10;
							if(i%2==0)
							{
								int n1=i%10;
								i=i/10;
								if(i%2==0)
								{
									System.out.println(n1 * 1000 + n2 * 100 + n3 * 10 + n4);
									count++;
//								break;
								}
							}
						}
				}
			}
			j++;
		}

				System.out.println("The total number of all digit even are :"+count);

	}

}