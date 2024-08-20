package inheritance;

import java.util.Scanner;

interface car{
	
	void brandName();
	
}

interface owner{
	void carOwner();
}

public class MultipleInheriRev implements car,owner {
	
	static void series() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the car series");
		String ser = sc.next();
		System.out.println("The car series is "+ ser);
		sc.close();
	}
	
	public void brandName() {
		System.out.println("BMW");
	}
	
	public void carOwner() {
		System.out.println("Rohit");
	}
	
	public static void main(String[] args) {
		series();
		MultipleInheriRev mr = new MultipleInheriRev();
		mr.brandName();
		mr.carOwner();
		
	}

	

}
