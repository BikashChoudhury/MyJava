public class RunnableLamdaEx{
	public static void main(String args[]){
		Thread MyThread = new Thread(new Runnable()
			{
				//@override
				public void run(){
					System.out.println("Normal Runnable .");
				}
			}
		);
		
		MyThread.start();

			Thread MyThread2 = new Thread( () -> System.out.println("Lamda Runnable .") );

		MyThread2.start();
	}
}