package webdriverproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class act {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		Thread.sleep(3000);
		bo.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		bo.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		bo.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	
		WebElement admin=bo.findElement(By.xpath("//b[contains(text(),'Admin')]"));
	    WebElement usermg= bo.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	    WebElement qualificaton=bo.findElement(By.xpath("//a[@id='menu_admin_Qualifications']"));
		WebElement licenc=bo.findElement(By.xpath("//a[@id='menu_admin_viewLicenses']"));
		Actions acr=new Actions(bo);
		Thread.sleep(3000);
		acr.moveToElement(admin).moveToElement(usermg).moveToElement(qualificaton).moveToElement(licenc).click().build().perform();
		
	Thread.sleep(3000);
	bo.findElement(By.xpath("//input[@id='btnAdd']")).click();
	Thread.sleep(3000);
	bo.findElement(By.xpath("//input[@id='license_name']")).sendKeys("pavan kumar");
	Thread.sleep(3000);
	bo.findElement(By.xpath("//input[@id='btnSave']")).click();
	System.out.println(bo.findElement(By.xpath("//a[contains(text(),'pavan kumar')]")).getText());
	
	if(bo.findElement(By.xpath("//a[contains(text(),'pavan kumar')]")).getText().equals("pavan kumar"))
		System.out.println("pass");
	else
		System.out.println("fail");
	
	bo.findElement(By.xpath("//input[@id='checkAll']")).click();
	bo.findElement(By.xpath("//input[@id='btnDel']")).click();

	
	}

}
