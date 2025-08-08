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

public class LiveDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		
		// capture all webelements into list
		List<WebElement> elelist = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all webelements into new list
		List<String> orglist = elelist.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sort in the list of step 3-> sorted list
		List<String> sortlist = orglist.stream().sorted().collect(Collectors.toList());
		// compare orignal list vs sorted list
		//Assert.assertTrue(orglist.equals(sortlist));
		// scan the name column if we gettext -> rice->print the price of the rice
		List<String> price;

		do {
		    List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		    price = rows.stream()
		                .filter(s -> s.getText().contains("Beans"))
		                .map(s -> getpriceveg(s))
		                .collect(Collectors.toList());

		    price.forEach(System.out::println);

		    WebElement nextBtn = driver.findElement(By.cssSelector("[aria-label='Next']"));
		    if (price.isEmpty() && !nextBtn.getAttribute("aria-disabled").equals("true")) {
		        nextBtn.click();
		    } else {
		        break; // stop if found or can't click further
		    }

		} while (price.isEmpty());
	} 
	private static String getpriceveg(WebElement s) {

		String priceval = s.findElement(By.xpath("following-sibling::td[1]")).getText();//// tr/td[1]/following-sibling::td[1]
		return priceval;
	}

}
