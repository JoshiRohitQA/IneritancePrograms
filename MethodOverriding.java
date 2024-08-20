package inheritance;

class Parent{
	
	void login() {
		System.out.println("Login with email-id");
	}
}
public class MethodOverriding extends Parent {
	
void login() {
		System.out.println("Login with mobile-no");
		super.login();
		
	}

public static void main(String[] args) {
	MethodOverriding m1 = new MethodOverriding();
	m1.login();

}
	

}
