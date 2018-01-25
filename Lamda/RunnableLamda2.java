class MyThread extends Thread{

	//@override
	public void run(){
		System.out.println("Normal Runnable .");
	}
}

public class RunnableLamda2{
	public static void main(String args[]){
		MyThread T= new MyThread();

		T.run();

		MyThread T2 = new MyThread( () -> System.out.println("Lamda Runnable .") );

		T2.run();
	}
}