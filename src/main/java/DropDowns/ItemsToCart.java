package DropDowns;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemsToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] item = {"Brocolli", "Beans" , "Musk Melon", "Potato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int size =item.length;
		for(int i=0; i< products.size(); i++) 
		{
			String[] name = products.get(i).getText().split("-");
			System.out.println(name);
			String formatedText = name[0].trim();
			
		//convert array into array list
			List itemList = Arrays.asList(item);
			
			int j=0;
			if(itemList.contains(formatedText))
			//if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==size)
				{
					break;
				}
				
			}
		}
		//System.out.println(products.size());  
		//driver.quit();
		
		

	}

}
