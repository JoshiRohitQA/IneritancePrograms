package inheritance;

class CarBrand{

	static void brandName() {
		System.out.println("BMW");
	}
	
	void modelName() {
		System.out.println("5 Series");
	}
}
		
public class SinglelevelAssign extends CarBrand {
	
	static void ownerName() {
		System.out.println("Rohit");
		
	}
	
	public static void main(String[] args) {
		brandName();
		SinglelevelAssign sa = new SinglelevelAssign();
		sa.modelName();
		ownerName();
		
	}

}
