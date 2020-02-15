package webdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCmantisloginpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.get("http://apps.qaplanet.in/bugtracker/login_page.php?return=%2Fbugtracker%2Fview_all_bug_page.php");
		 
		 String expcttitle="MantisBT";
		 String acttitle=driver.getTitle();
		 
		 if(expcttitle.equals(acttitle))
		 {
		System.out.println("home page displayed");
		 }
		 else
		 {
			 System.out.println("home page notdisplayed");
		 }
		 
	}

}
