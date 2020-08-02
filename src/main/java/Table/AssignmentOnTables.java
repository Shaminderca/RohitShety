package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement tableDriver =driver.findElement(By.id("product"));
    	int countR =	tableDriver.findElements(By.tagName("tr")).size();
    	int countC =    tableDriver.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
    	List <WebElement> SecondRow = tableDriver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
    	String ContentOne =SecondRow.get(0).getText();
    	String ContentTwo =SecondRow.get(1).getText();
    	String ContentThree =SecondRow.get(2).getText();
    	System.out.println(countR);
    	System.out.println(countC);
    	System.out.println(ContentOne);
    	System.out.println(ContentTwo);
    	System.out.println(ContentThree);
    	
    	
    	
    	

	}

}
