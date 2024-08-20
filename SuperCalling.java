package inheritance;



class Flip{
	Flip(){
		System.out.println("Supermost class");
	}
}

class Amazoon extends Flip {
	Amazoon(int a,double b){
		super();
		System.out.println("This is super class");
	}
}
public class SuperCalling extends Amazoon {
	
	SuperCalling(){
		
		super(12,23.2);
		
		System.out.println("Google");
	}
	
	public static void main(String[] args) {
		SuperCalling s1 = new SuperCalling();
		
		
		
	}

}
