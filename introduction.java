package introduction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ur-path-id");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts()
.implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/otp");
		driver.findElement(By.id("name")).sendKeys("Vatsal");
		driver.findElement(By.id("email")).sendKeys("vatsal");
		driver.findElement(By.className("Y4agH")).click();
		//System.out.println(driver.findElement(By.className(" ")).getText());
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@placeholder='you@email.com']")).sendKeys("vatsal");
		
		//driver.quit();		

	}

}
