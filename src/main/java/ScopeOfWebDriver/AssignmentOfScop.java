package ScopeOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOfScop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());
		String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
	WebElement dropdown=	driver.findElement(By.id("dropdown-class-example"));
	Select obj = new Select(dropdown);
	obj.selectByVisibleText(option);
	driver.findElement(By.id("name")).sendKeys(option);
	driver.findElement(By.id("alertbtn")).click();
	String text = driver.switchTo().alert().getText();
	if(text.contains(option))
	{
		System.out.println("Ok Result");
		
	}
	else
	{
		System.out.println("NG Result");
	} 
		
	Thread.sleep(5000);
	driver.quit();

	}

}
