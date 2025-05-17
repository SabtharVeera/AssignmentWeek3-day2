package AssignmentsWeek3;

public class LoginStatus extends LoginTestData{
	public void Loginsuccessfull() {
		System.out.println("Login is successfull");
	}
	public void Loginunsuccessfull() {
		System.out.println("Login is unsuccessfull");
	}
	public static void main(String[] args) {
		LoginStatus ls = new LoginStatus();
		ls.enterUsername();
		ls.enterPassword();
		ls.enterCredentials();
		ls.Loginsuccessfull();
		ls.Loginunsuccessfull();
		ls.navigateToHomePage();
		
	}
	
	

}
