import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	
	@Test()
	public void precondition() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree\\Downloads\\Video\\ChromeServer\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		WebElement Password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		Password.sendKeys("admin12");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();;
	}
	@Test(dependsOnMethods="precondition")
	public void Test() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
	}
	
	

}
