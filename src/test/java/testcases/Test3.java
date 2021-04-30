package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.WebDriverBase;

public class Test3 extends WebDriverBase{
	
   
    public void testSomeLibraryMethod() throws InterruptedException{
    //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		
        driver.get("http://www.facebook.com");
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.close();
	
}
}   