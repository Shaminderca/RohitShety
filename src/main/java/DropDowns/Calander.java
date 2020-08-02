package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		if(driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).isEnabled()) {
			Assert.assertTrue(true);
			System.out.println("its enabled");
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@value='IXU']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DHM']")).click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
			driver.findElement(By.cssSelector("#divpaxinfo")).click();

			Thread.sleep(2000);
			
			Select object = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			object.selectByIndex(4);
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		}
		else 
		{
			Assert.assertTrue(false);
			System.out.println("its disabled");
		}
driver.quit();
	}

}
