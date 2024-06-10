package automation_projectdemo_lecture3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLink {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
		
		usernamefield.click();
		usernamefield.sendKeys("Admin");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		password.click();
		password.sendKeys("Admin@123");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		login.click();
		
		

//     WebElement link1 = driver.findElement(By.linkText("Forgot Your Password?"));
//
//		System.out.println(link1.isDisplayed());
//
		// take 3 second pause for clicking the link...
//		Thread.sleep(3000);
//
//		link1.click();
//
//		Thread.sleep(3000);
//		driver.navigate().back();
//
//		WebElement link2 = driver.findElement(By.partialLinkText("Use Custom"));
//
//		System.out.println(link2.isDisplayed());
//
//		link2.click();
//
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		
		
	}

}
