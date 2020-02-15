 package webdriverproject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findlinks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://www.redbus.in/");
		//bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		List<WebElement> nl=bo.findElements(By.tagName("a"));
		//System.out.print(nl.size());
		/*for(WebElement link:nl)      //enhanced for loop
		 * {
			 System.out.println(link.getText() + " URL is"    + link.getAttribute("href"));
			 }*/
		
		/*for(int i=0;i<nl.size();i++) {
			System.out.println(nl.get(i).getAttribute("href"));
		}*/
		
		Iterator<WebElement> i=nl.iterator();
		while(i.hasNext())
		{
	
			 System.out.println(i.next().getAttribute("href"));	
}

         bo.close();
	}

	}


