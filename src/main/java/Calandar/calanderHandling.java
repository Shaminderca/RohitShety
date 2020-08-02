package Calandar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calanderHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		//WebElement popUp =driver.findElement(By.cssSelector(".sumome-react-wysiwyg-component.sumome-react-wysiwyg-outside-horizontal-resize-handles.sumome-react-wysiwyg-outside-vertical-resize-handles.sumome-react-wysiwyg-close-button.sumome-react-wysiwyg-popup-image.sumome-react-wysiwyg-image"));
	   
	   // driver.findElement(By.id("travel_date")).click();
		//.driver.findElementBy.XPath(".//*[@id='travel_date']").click();
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
	 
		
	}
}


