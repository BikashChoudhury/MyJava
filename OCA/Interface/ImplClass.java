Interface InterfaceExampesINT{
	abstract void methord(){
	
	}
}

class ImplClass implements InterfaceExampesINT{
	abstract void methord(){
	
	}
}

class ImplClass2 extends ImplClass{
	void methord(){
		System.out.println("Done");
	}
}

public class InterfaceExampes{
	public static void main(String args[])
	{
			InterfaceExampesINT I=new ImplClass2();
			I.methord();
	}
}

//https://youtu.be/ghswNpRv2t0