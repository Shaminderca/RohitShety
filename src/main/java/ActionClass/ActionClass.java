package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList")); 
		a.moveToElement(element).build().perform();
		WebElement element1 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.moveToElement(element1).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		a.moveToElement(element).contextClick().build().perform();
	//	driver.quit();
		
		
		
	}

}
