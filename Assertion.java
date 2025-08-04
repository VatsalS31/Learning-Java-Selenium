package introduction;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		//count number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(3000);
		driver.close();

	}

}


/*
WE USE THIS TO VALID THE SCRIPTS THERE ARE MAJORILY 3 TYPES OF ASSESTIONS THAT IS ASSERTFALSE,ASSERTTRUE,ASSERTEQUALS AND THEY ARE TO CHECK IF THE SCRIPT IS TRUE,
FALSE OR IF SOMETHING WHICH WE WANT TO VERIFY WITH SOME CONDITION THEN WE USE ASSERTEQUALS TO CHECK INSTEAD OF PRINT STATEMENT WE CAN CHECK TO VALIDATE THE
OUTPUTS



*/
