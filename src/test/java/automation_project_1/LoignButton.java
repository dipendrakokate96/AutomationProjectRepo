package automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoignButton {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement usernamefield = driver.findElement(By.cssSelector("[type='email']"));

		usernamefield.click();
		usernamefield.sendKeys("dipendrakokate2@gmail.com");
		System.out.println(usernamefield.getAttribute("value"));

		Thread.sleep(2000);
		WebElement passwordfield = driver.findElement(By.cssSelector("[type='password']"));
		passwordfield.click();

		passwordfield.sendKeys("dipen1995");

		System.out.println(passwordfield.getAttribute("value"));

		Thread.sleep(2000);

		WebElement loginbtn = driver.findElement(By.cssSelector("[type='submit']"));

		loginbtn.click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
