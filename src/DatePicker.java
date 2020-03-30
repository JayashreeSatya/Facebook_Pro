
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public void main()
	{
		System.out.println("It is Complete Menthod");
	}
public static void main(String[] args) {
	String date="12";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree\\Downloads\\Video\\ChromeServer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.xpath("//div/a/span[text()='Next']")).click();
	driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+date+"']")).click();
	
	
}
}
