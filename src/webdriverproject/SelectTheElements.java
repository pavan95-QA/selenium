package webdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		WebElement element=bo.findElement(By.xpath("//select[@id='programming-languages']"));
		
		Select dropdown=new Select(element);  //select the dropdown box
	System.out.println(dropdown.getOptions().size());  //count how many options
	dropdown.selectByIndex(1);     //select by using index
	 dropdown.selectByValue("C#"); //select by usig value
	 
	 //radio button selection
	WebElement E= bo.findElement(By.xpath("//input[@id='magazines-radio-btn']"));
    System.out.println(E.isSelected());
    E.click();
    
    //checkboxes
    bo.findElement(By.id("bicycle-checkbox")).click();
    
	}

}
