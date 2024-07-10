package guru99Project;

public class DemoGuru99Project {

	public static void main(String[] args) {
		Guru99Project guru99Project = new Guru99Project();
		guru99Project.invokeBrowser();
		guru99Project.login();
		guru99Project.addCustomer();
		String customerId = guru99Project.getCustomerId();
		System.out.println(customerId);
		guru99Project.addAccount(customerId);
		
	}

}
