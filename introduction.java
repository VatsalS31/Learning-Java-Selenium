/*
package introduction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts()
.implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/otp");
		driver.findElement(By.id("name")).sendKeys("Vatsal");
		driver.findElement(By.id("email")).sendKeys("vatsal");
		driver.findElement(By.className("Y4agH")).click();
		//System.out.println(driver.findElement(By.className(" ")).getText());
		driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.xpath("//input[@placeholder='you@email.com']")).sendKeys("vatsal");
		driver.findElement(By.cssSelector("input[placeholder='you@email.com']")).sendKeys("john@rsa.com");
		//driver.findElement(By.xpath("//input[@placeholder='you@email.com']")).clear();
		//driver.quit();		

	}

}

*/


import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;





public class Locators {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out


System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.id("inputUsername")).sendKeys("rahul");

driver.findElement(By.name("inputPassword")).sendKeys("hello123");

driver.findElement(By.className("signInBtn")).click();

System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

driver.findElement(By.linkText("Forgot your password?")).click();

Thread.sleep(1000);//

driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

System.out.println(driver.findElement(By.cssSelector("form p")).getText());

driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

Thread.sleep(1000);

driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

driver.findElement(By.id("chkboxOne")).click();

driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();





}



}
