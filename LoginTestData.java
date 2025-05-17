package AssignmentsWeek3;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Username");
	}
	public void enterPassword() {
		System.out.println("Password");
	}
	public static void main(String[] args) {
		LoginTestData ld = new LoginTestData();
		ld.enterCredentials();
		ld.navigateToHomePage();
		ld.enterUsername();
		ld.enterPassword();
	}
	
	
}
