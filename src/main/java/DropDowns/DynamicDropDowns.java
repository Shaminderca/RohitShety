package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {
	
	public static void main() throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	WebElement x =  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	WebElement a =	driver.findElement(By.xpath("//a[@value='BLR']"));
	WebElement b =  driver.findElement(By.xpath("(//a[@value='IXZ'])[2]"));
	x.click();
	Thread.sleep(2000);
	a.click();
	Thread.sleep(2000);
	b.click();
	driver.quit();
		
		
		
	}


}
