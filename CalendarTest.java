package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

public class CalendarTest {

	public static void main(String[] args) {
		String month="6";
		String date="15";
		String year="2027";
		String[] expectedList= {month,date,year};
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List<WebElement>actuallist=driver.findElements(By.cssSelector((".react-date-picker__inputGroup__input")));
		for(int i=0;i<actuallist.size();i++)
		{
			System.out.println(actuallist.get(i).getAttribute("value"));
			Assert.assertEquals(actuallist.get(i).getAttribute("value"), expectedList[i]);
			
		}
		driver.close();
		
		
	}

}

/*
An assertion is a statement in your test that checks whether a condition is true or false. If the condition is false, the test fails and typically throws an error (e.g., AssertionError in Java).


*/
