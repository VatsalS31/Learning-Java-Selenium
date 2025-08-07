package introduction;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		Proxy pro= new Proxy();
		pro.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy",pro);
		//SETS THE FOLLOWING DIECTORY TO DOWNLOAD ANYTHING FORM CHROME
		Map<String,Object>prefs=new HashMap<String,Object>();
		prefs.put("download.default_directory", "/directory/path");
		
		//By default, ChromeDriver configures Chrome to allow pop-up windows. If you want to block pop-ups, and restore the normal Chrome behavior when it isn't controlled by ChromeDriver,
		options.setExperimentalOption("prefs", prefs);
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "/Users/vatsalshah/Downloads/cdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
