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

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//		driver.findElement(By.id("draggable")).click();
		driver.switchTo().frame(0);
		//drag n drop
		Actions a = new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement tar=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(src,tar).build().perform();
		driver.switchTo().defaultContent();

	}

}
