package webdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conditionalcommand {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//open browser
		driver.get("https://www.facebook.com/");
		
		//find email&psw elements and stores in webElement
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement psw=driver.findElement(By.xpath("//input[@name='pass']"));
		
		//email is displayed and enabled then enter the values
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("9640104315");
		}
		//psw is displayed and enabled then enter the values
		if(psw.isDisplayed() && psw.isEnabled())
		{
			psw.sendKeys("pavanb95");
		}
		
		//find login button and click it
	   driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
        
	}

}
