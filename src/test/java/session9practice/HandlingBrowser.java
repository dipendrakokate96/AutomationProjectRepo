package session9practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String prentwindowid = driver.getWindowHandle();
		System.out.println("Parent Window Handle : " + prentwindowid);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement dd = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));

		dd.click();

		String childwindowhandleid = driver.getWindowHandle();
		
		driver.switchTo().window(childwindowhandleid);
		System.out.println("Child Window Handle : " + childwindowhandleid);
		
		driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("dipendrakokate2@gmail.com");
		
		Thread.sleep(3000);
		
		driver.close();

	}
}
