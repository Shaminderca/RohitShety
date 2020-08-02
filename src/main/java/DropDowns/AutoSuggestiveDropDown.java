package DropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//.findElement(By.cssSelector("div.")
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    WebElement box = driver.findElement(By.className("autopop__wrap makeFlex column defaultCursor"));
	    wait.until(ExpectedConditions.visibilityOf(box));
	   // wait.until(ExpectedConditions.elementToBeClickable(By.className("autopop__wrap makeFlex column defaultCursor")));
	    driver.findElement(By.id("fromCity")).click();
		
		
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("inpu.t[class='.react-autosuggest__input.react-autosuggest__input--open']")).click();

	}

}
