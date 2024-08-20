package inheritance;

class Youtube{
	
	Youtube(String a, double b){
		System.out.println("Youtube");
	}
}

class Gogle extends Youtube{
	Gogle(){
		super("Rohit",32.2);
		System.out.println("Google");
	}
	
}

public class SuperAmazon extends Gogle{
	
	SuperAmazon(){
		
		System.out.println("Amazon");
	}
	
	public static void main(String[] args) {
		new SuperAmazon();
		
	}

}
