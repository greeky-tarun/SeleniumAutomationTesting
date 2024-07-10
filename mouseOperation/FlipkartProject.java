package mouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProject {
	ChromeDriver driver;
	String url = "http://flipkart.com";
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIIT\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);

		
	}
	
	public void mouseHover(){
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WaitUtility.waitTillElementVisibile(driver, By.xpath("//span[text()='Electronics']"),10);
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[Text()='Electronics']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(electronicsLink).build().perform();
		
		WaitUtility.waitTillELementVisibile(driver, By.xpath("(//a[text()="'Samsung'])[1]"), 18);
		
		WebElement samsungLink = driver.findElement(By.xpath("(//a[text()='Samsung'])[1]"));
		
		action.moveToElement(samsungLink).click().build().perform();
		
		
	}
	
	public static void main(String[] args) {
		FlipkartProject fp = new FlipkartProject();
		fp.invokeBrowser();
		
		fp.mouseHover();
	}
}
