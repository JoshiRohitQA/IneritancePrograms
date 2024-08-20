package inheritance;

public class Flipkart extends Google {
	
	void filpme() {
		System.out.println("Flipkart");
	}
	
public static void main(String[] args) {
	Flipkart flip = new Flipkart();
	flip.googleme();
	flip.filpme();
}

}
