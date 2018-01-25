class Student{
	int x;
	Student(){
		this.x=5;
	}
	Student(int x){
		this.x=x;
	}
	public String toString(){
//		return x;
		return String.format("x= "+x);
	}
}

class ABC{
	public static void main(String args[]){
		Student[] s=new Student[10000];
		s[0]=new Student();
		s[1]=new Student(10);
		
System.out.println(s[0] + " " + s[1]);
	}
}