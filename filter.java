package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Proxy;
import java.time.Duration;
import java.util.*;

public class Filter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement>veggies=driver.findElements(By.xpath("//tr/td[1]"));
		//5 results
		List<WebElement> filteredlist=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		//1 result
		Assert.assertEquals(veggies.size(), filteredlist.size());
		
		
	}

}
