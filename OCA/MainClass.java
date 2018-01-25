class Cat{
		public static void meaw(){
			System.out.println("meaw");
		}
}

class kitten extends Cat{
		public static void meaw(){
			System.out.println("yamyam");
		}
}

public class MainClass{
	public static void main(String[] args)
	{
		Cat c=new Cat();
		Cat ck=new kitten();
		kitten k =new kitten();

		c.meaw();
		ck.meaw();
		k.meaw();
	}
}