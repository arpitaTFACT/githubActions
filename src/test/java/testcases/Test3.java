package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3{
	
   
    	public void testChrome1()
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		
        driver.get("http://www.facebook.com");
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.quit();
	}

	public void testChrome2()
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");  
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
	
		WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("http://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("testingDemo@gmail.com");
        
        driver.quit();
	}
	
	@Test
	public void testChrome3()
    {
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        
        driver.navigate().to("http://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.quit();
    }
	
	public void testChrome4()
    {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("http://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.quit();
    }
}   
