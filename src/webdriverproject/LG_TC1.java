package webdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LG_TC1 {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/bugtracker/login_page.php?return=%2Fbugtracker%2Fview_all_bug_page.php");
	
		
		driver.findElement(By.name("username")).sendKeys("edward");
		driver.findElement(By.name("password")).sendKeys("qwerty123");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("View Issues")).click();
		driver.findElement(By.partialLinkText("0000061")).click();
		
		System.out.println(driver.getTitle());
		
		String exp_title = "0000061: Empty pop-up shows up when password field is left blank. - MantisBT";
		String actual_title = driver.getTitle();
		
		if(exp_title.equals(actual_title) == true)
		{
		System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}
		driver.navigate().back();
		
	}

}
