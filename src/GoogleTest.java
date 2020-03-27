import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	@BeforeMethod
	public void precondtion()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree\\Downloads\\Video\\ChromeServer\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();		
		
	}
	@Test(priority=1,groups="EnterText")
	public void entertext() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement searchtext=driver.findElement(By.name("q"));
		searchtext.sendKeys("Java",Keys.ENTER);
	}
	@Test(priority=3,groups="text")
	public void test() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement searchtext=driver.findElement(By.name("q"));
		searchtext.sendKeys("Gmail",Keys.ENTER);
	}
	@Test(priority=2,groups="ClickLink")
	public void test3() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement searchtext=driver.findElement(By.name("q"));
		searchtext.sendKeys("Java",Keys.ENTER);
		WebElement link=driver.findElement(By.xpath("//h3[text()='Java | Oracle']"));
		link.click();
		
	}
	@AfterMethod
	public void postCondtion()
	{
		driver.close();
	}
	
	

}
