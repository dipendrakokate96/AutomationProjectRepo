package automation_projectdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthAutomationScript {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
//		
//		WebElement Username = driver.findElement(By.id("email"));
//		
//       Username.click();
//       Username.sendKeys("9165248812");
//       
//       WebElement Password = driver.findElement(By.id("pass"));
//       
//       Password.click();
//       Password.sendKeys("dipen@1996");
//       
      // WebElement Login = driver.findElement(By.name("login"));
       
     //  Login.click();
       
	
		
	}

}
