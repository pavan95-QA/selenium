package webdriverproject;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchwait {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,60);
		Actions act=new Actions(driver);
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		if(wait.until(ExpectedConditions.titleContains("OrangeHRM - New Level of HR Management")))
		{
		System.out.println("home page displayed");	
		}
		else
		{
		System.out.println("home page is not displayed ");	
		return;
		}

	}

}
