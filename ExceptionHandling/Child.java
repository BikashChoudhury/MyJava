class Parent {
	public void process() {
		System.out.print("Parent,");
	}
}

class Child extends Parent
{
	public void process() throws IOException {
		super.process();
		System.out.print("Child,");
		throw new IOException();
	}
	public static void main(String[] args) {
		try {
			new Child().process();
		}
		catch ( Exception e) {
			System.out.println("Exception" + e); 
		}
	}
	
	
	
	
}