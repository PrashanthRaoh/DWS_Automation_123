package test.Automation_CI_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SampleTest {
	
	
	@Test
	public void Demo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.close();
		System.out.println(" Test Case Completed");
	}

}
