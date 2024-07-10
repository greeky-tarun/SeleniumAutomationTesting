package guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {

	ChromeDriver driver;
	String url = "https://demo.guru99.com/v4/";
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIIT\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
			
	}
	
	public void login() {
		//by this i am identifying one of the web element on the page
		WebElement usernameElement = driver.findElement(By.name("uid")); 
		usernameElement.sendKeys("mngr580794");
		driver.findElement(By.name("password")).sendKeys("petEtEr");
		driver.findElement(By.name("btnLogin")).click();		
	}
	
	public String getCustomerId() {
		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}
	
	
	//Working with Basic form Element
	public void addAccount(String customerID) {
		
		//for new account
		driver.findElement(By.linkText("New Account")).click();
		
		//for customer id
		driver.findElement(By.name("cusid")).sendKeys(customerID);
		
		//for dropdown menu of account
		WebElement selectAccountDropdown = driver.findElement(By.name("selaccount"));
		Select selectAccountType = new Select(selectAccountDropdown);
		
		//dropdowns are saving or current
		selectAccountType.selectByVisibleText("current");
		
		//deposite 
		driver.findElement(By.name("inideposit")).sendKeys("32434");
		
		driver.findElement(By.name("button2")).click();
		
	}
	
}
