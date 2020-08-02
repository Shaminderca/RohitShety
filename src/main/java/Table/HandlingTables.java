package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/5417/rsa-vs-pak-1st-test-pakistan-in-south-africa-test-series-2002-03");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[ class = 'cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[ class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int Sum = 0;
		for(int i=0;i<count-2;i++)
		{
			//here we transver from parent to child
			System.out.println(table.findElements(By.cssSelector("div[ class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value = table.findElements(By.cssSelector("div[ class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int integervalue =Integer.parseInt(value);
			Sum = Sum + integervalue;
			System.out.println(Sum + "of" + i);
		}
		//System.out.println(count);
		//System.out.println(rowcount);
		//here we transver from sibling to sibling
		System.out.println("sum of extras"  + driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		String ExtrasValue = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int ExtrasValues = Integer.parseInt(ExtrasValue);
		
		int TotalValue = Sum + ExtrasValues;
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	    String  Total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	  int finalTotal =  Integer.parseInt(Total);
	  
	  if (TotalValue == finalTotal)
	  {
		  System.out.println("Ok Value");
	  }
	    
	    
	    
	
		
		 

	}

}
