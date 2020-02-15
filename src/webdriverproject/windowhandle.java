package webdriverproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows/");
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentwindow);
		WebElement clickelement=driver.findElement(By.xpath("//button[@id='button1']"));
		
		for(int i=0;i<2;i++) {
			clickelement.click();
			Thread.sleep(3000);
		}
		
		Set<String> allWindowHandles = driver.getWindowHandles();
	/*	Iterator<String>it=allWindowHandles.iterator();
		while (it.hasNext()){
			String childw=it.next();
			 if(parentwindow.equalsIgnoreCase(childw))           
	         {          
	             driver.switchTo().window(childw); 
	             String z = driver.getTitle();
	             System.out.println(z);
		}*/
		for(String handles:allWindowHandles) {	
		if(handles.equals(parentwindow)){
				Thread.sleep(3000);
				driver.switchTo().window(handles);
				String z=driver.getTitle();
	            System.out.println(z);
	          
	          	
		}
		}
	}
}
			
