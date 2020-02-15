package webdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mantislogin {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/bugtracker/login_page.php?return=%2Fbugtracker%2Fview_all_bug_page.php");
	
		
		driver.findElement(By.name("username")).sendKeys("edward");
		driver.findElement(By.name("password")).sendKeys("qwerty123");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("View Issues")).click();
		
	if(driver.findElement(By.xpath("//input[@name='all_bugs']")).isSelected()==false)
    {
	     driver.findElement(By.xpath("//input[@name='all_bugs']")).click();
	}
	     driver.findElement(By.xpath("//input[@class='button']")).click();
	     
	     driver.navigate().back();
	     driver.navigate().back();
	     driver.findElement(By.linkText("Logout")).click();
	     driver.navigate().to("https://www.facebook.com/");

	}

}
