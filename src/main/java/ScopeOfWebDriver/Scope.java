package ScopeOfWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
       System.out.println(driver.findElements(By.tagName("a")).size());
       WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
       System.out.println(footerdriver.findElements(By.tagName("a")).size());
       WebElement abc = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
  //   WebElement insideFooter   =  footerdriver.findElements(By.xpath("//table/tbody/tr/td[1]/ul"); 
       System.out.println(abc.findElements(By.tagName("a")).size()); 
       int i;
       for( i=1;i< abc.findElements(By.tagName("a")).size();i++);
     //  (int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
       {
    	  String KeysToHandel = Keys.chord(Keys.CONTROL,Keys.ENTER);
    	  abc.findElements(By.tagName("a")).get(i).sendKeys(KeysToHandel);
    	  Thread.sleep(3000);
    	  }
    	  Set<String> obj =  driver.getWindowHandles();
    	  Iterator<String> it = obj.iterator();
    	  while(it.hasNext())
    	  {
    		 driver.switchTo().window(it.next());
    		 System.out.println(driver.getTitle());
    		  
    	  }
       }
}


