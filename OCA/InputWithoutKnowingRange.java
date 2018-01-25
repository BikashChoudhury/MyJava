/*
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.InputMismatchException;
*/
import java.util.*;


class InputWithoutKnowingRange{
	public static void main(String args[]){

		Scanner in=new Scanner(System.in);
		Collection<Integer> N= new ArrayList<>();
		while(true){
			try{
				int n=in.nextInt();
				char c=in.next().charAt(0);
				N.add(n);
			}
			catch(InputMismatchException e){
				break;
			}
		}

		System.out.println("Done");

		for(int i : N)
		{
			System.out.println(i);
		}
	}
}