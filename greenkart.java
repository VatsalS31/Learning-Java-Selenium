package introduction;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.*;

public class base {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-"); // in the form of array it will be split
			String formatedname = name[0].trim();// whitespaces will be trimed and proepr vegetable name will be there
			// format it to get actual vegetables
			// check whether name you extracted is present in array or not
			// convert array to arraylist for easy search

			List al = Arrays.asList(itemsNeeded);

			if (al.contains(formatedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				//WE USED XPATH BCOZ WHEN IT CLICKED ADD TO CART TEXT GOT CHANGED AND INSTEAD OF STARING WITH NEW INDEX IT STARTED WITH INDEX 0 AGAIN AND EVERYTHING GOT MISMATCHED
				if (j == 3) {
					break;
				}
				// break;

			}
		}
	}

}
