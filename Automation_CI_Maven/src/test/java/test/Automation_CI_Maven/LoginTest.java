package test.Automation_CI_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("prady0789@test.com");
		driver.findElement(By.id("Email")).sendKeys("aaaaaaaaaa");
		driver.close();
		System.out.println(" Login Test Case Completed");
	}

}
