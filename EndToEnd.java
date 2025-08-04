package introduction;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//STEP-1 TO SELECT THE SOURCE AND DESTINATION
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		// STEP-2 CALENDAR
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			
			//System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		//STEP-3 PASSENGERS
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000);
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		 // SELECT CURRENCY
		
		WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Thread.sleep(1000);
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);//INR
		Thread.sleep(2000);
		
		// FINAL SEARCH
		
		// IF YOU KNOW THE ID
		//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		//CUSTOMIZE CSS
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		//
		Thread.sleep(4000);
		//driver.close();
		
		

	}

}

/*
AUTOMATING END TO END AN FULL WEBSITE WITH DROPDOWN,CALENDAR,PASSENFER COUNT ,CURRENCT,ETC

*/
