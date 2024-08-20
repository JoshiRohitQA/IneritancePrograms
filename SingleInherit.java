package inheritance;

class Amazon{
	
	static void loginwithmobilenum() {
		System.out.println("Mobile no");
	}
	
	void registration() {
		System.out.println("Registered mobile");
	}
}

public class SingleInherit extends Amazon {
	
	static void loginwithEmail() {
		System.out.println("Emialid");
	}
	
	void logout() {
		System.out.println("logout");
	}
	
	public static void main(String[] args) {
		loginwithEmail();
		loginwithmobilenum();
		SingleInherit i1 = new SingleInherit();
		i1.registration();
		i1.logout();
		
	}

}
