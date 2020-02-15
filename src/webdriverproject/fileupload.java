package webdriverproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		 bo.get("http://dmlogics.in/build1/ProfileUpdate.html");
		 //Locating 'browse' button
		 WebElement browse =bo.findElement(By.xpath("//input[@id='photo']"));
		 JavascriptExecutor js=(JavascriptExecutor)bo;
		 js.executeScript("arguments[0].click();",browse);
		 browse.click();
		 Runtime.getRuntime().exec("‪C://Program Files (x86)/autoit filefile.exe");
		 }
		}

