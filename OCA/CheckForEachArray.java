import java.lang.Iterable;

public class CheckForEachArray{
    public static void main(String args[]){
	Integer[] a = new Integer[10];

	for(int i=0;i<10;i++){
		a[i]= i;
	}
	
	a.forEach(i -> System.out.print(i));
    }
}