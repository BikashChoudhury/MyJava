public class RunnableLamda{
	public static void main(String args[]){
		Thread MyThread = new Thread(new Runnable()
			{
//				@override
				public void run(){
					System.out.println("Normal Runnable .");
				}
			}
		);

		MyThread.run();

			Thread MyThread2 = new Thread( () -> System.out.println("Lamda Runnable .") );

		MyThread2.run();
	}
}