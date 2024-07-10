package FirstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;//working with Chrome browser and the driver is the instance in chromedriver class
	String url = "https://countmycrunch.netlify.app/";
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIIT\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		//to maximize the Chrome browser
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void closeBrowser() {
		//you can close window by any of the command
		//driver.close();//to close current active window
		driver.quit();//to close all the windows
	}
	public static void main(String[] args) {
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		wc.closeBrowser();
	}
	
}
