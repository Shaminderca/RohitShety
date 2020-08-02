package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(15000);
		WebElement a = driver.findElement(By.className("react-autosuggest__input.react-autosuggest__input--open"));
		a.click();
		//WebElement a = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		//a.click();
		//Thread.sleep(2000);
	  //  WebElement b =	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='JLR']" ));
		//WebElement b = driver.findElement(By.cssSelector("input.select_CTXT.valid"));
      //  b.click();
      //  Thread.sleep(5000);
      //  WebElement c =	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='ATQ']" ));
       // WebElement c =	driver.findElement(By.xpath("(//a[@value='CCU'])[2]" ));
      //  c.click();
	}
	

}
