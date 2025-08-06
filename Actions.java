package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		// Add wait to allow dynamic content to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Use proper selector — double check if it’s present
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

		Actions a = new Actions(driver);
		a.moveToElement(accountList).build().perform();


	}

}
