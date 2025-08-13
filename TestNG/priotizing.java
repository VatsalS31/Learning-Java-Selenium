package day1;

import org.testng.annotations.Test;

public class Priotizing {
    @Test
    public void WebLogin()
    {
        System.out.println("WebHomeLogin");
        //selenium
    }
    @Test
    public void AppLogin()
    {
        System.out.println("AppHomeLogin");
        //appium
    }
    @Test
    public void LoginAPI()
    {
        System.out.println("HomeAPILogin");
        //RestAPI
    }
}
