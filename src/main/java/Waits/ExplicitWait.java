package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
	//driver.findElement(By.xpath("//*[text()=''Click to load get data via Ajax!]")).click();
	driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("results")));
	System.out.println(driver.findElement(By.id("results")).getText());
	driver.quit();
	
	}
}
