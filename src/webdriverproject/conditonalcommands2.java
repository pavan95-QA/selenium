package webdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conditonalcommands2 {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement psw=driver.findElement(By.xpath("//input[@name='pass']"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("9640104315");
		}
		if(psw.isDisplayed() && psw.isEnabled())
		{
			psw.sendKeys("pavanb95");
		}
		
		// find radio button and it is already selected or not checking
		System.out.println(driver.findElement(By.xpath("//input[@id='u_0_6']")).isSelected());
		
	   // female radio button not selected then we have command select that one.
		if(driver.findElement(By.xpath("//input[@id='u_0_6']")).isSelected()==false)
		{
			driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
		}
	
	}

}
