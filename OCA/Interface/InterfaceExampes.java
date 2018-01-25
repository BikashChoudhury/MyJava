interface InterfaceExampesINT{
	abstract public void methord();
}

abstract class ImplClass implements InterfaceExampesINT{
	  abstract public void methord();
}

class ImplClass2 extends ImplClass{
	public v oid methord(){
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