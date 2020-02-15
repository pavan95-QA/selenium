package webdriverproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigationalcomand {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.orangehrm.com/");
		System.out.println(driver.getTitle());
		
        driver.navigate().to("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
	}

}
