package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// //a[@value='MAA']
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		// HANDLING CALENDAR
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		// //a[@value='BLR']

	}

}

/*
WE WILL CREATE THE XPATH AND AUTOMATE THE DROPDOWNS..IN THIS WE WILL SEE THAT WHEN WE CREATE MAA XPATH IT WILL SHOW IN 2 ELEMENTS BUT WE WANT ONLY 1 ,2ND ONE WILL BE FROM WILL BE TO PART
BUT WE WILL USE INDEXING TO SELECT THE 2ND ONE ON TO
*/
