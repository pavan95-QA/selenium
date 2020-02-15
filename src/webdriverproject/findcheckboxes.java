package webdriverproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findcheckboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		List<WebElement> boxes=bo.findElements(By.xpath("//input[@type='checkbox']"));
    System.out.println(boxes.size());
	}

}
