package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {  
		WebDriver driver=new ChromeDriver();  
		
        driver.get("http://www.facebook.com");
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.close();
	}
}
