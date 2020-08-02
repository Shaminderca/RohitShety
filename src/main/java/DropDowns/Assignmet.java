package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\RohitShatty\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.quit();

	}

}
