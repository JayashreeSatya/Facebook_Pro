import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitletest {
	WebDriver driver;
	
	@BeforeMethod
	public void Precondition()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree\\Downloads\\Video\\ChromeServer\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void Gettitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	@AfterMethod
	public void postcondtion()
	{
		driver.close();
	}

}
