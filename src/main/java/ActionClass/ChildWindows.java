package ActionClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		//driver.findElement(By.cssSelector("a[href*='windows']")).click();
		//System.out.println(driver.getTitle());
		
		//Get all Ids
		Set<String> id =driver.getWindowHandles();
		//Now Iterate
		Iterator<String> it =id.iterator();
		String parent = it.next();
		driver.switchTo().window(it.next());
		driver.findElement(By.xpath("//div/h3")).getText();
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

			
		
	}

}
