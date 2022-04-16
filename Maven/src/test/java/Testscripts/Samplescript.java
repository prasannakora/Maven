package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
   
public class Samplescript {
	   @Test
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
           driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
          driver.findElement(By.linkText("Login")).click();
           Thread.sleep(3000);    
	driver.close();
}


	}


