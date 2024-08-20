package inheritance;

public class This_Calling_Statement {
	
	 This_Calling_Statement(int a) {
		 System.out.println("With int a");
		
	}
	 
	 This_Calling_Statement(double a){
		 this(23);
		 System.out.println("With double a");
		 
	 }
	 
	 This_Calling_Statement(){
		 this(9.32);
		 System.out.println("with no para");
		 
	 }
	 
	 public static void main(String[] args) {
		new This_Calling_Statement();
	}
	 

}
