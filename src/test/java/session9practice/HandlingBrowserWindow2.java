package session9practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingBrowserWindow2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// launches browser window with the mentioned UR\L
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		// Store the ID of the parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Hanadle  " + parentWindow);

		// Click the link which opens in a new window
		WebElement link1 = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		link1.click();

		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		WebElement dropdownclick = driver.findElement(By.xpath("//a[text()='Resources']")); // li[@class='nav-item
																							// dropdown'][3]//following::a

		dropdownclick.click();

		Select sd = new Select(dropdownclick);

		sd.selectByVisibleText("Blog");

		/*
		 * // Loop through until we find a new window handle for (String windowHandle :
		 * driver.getWindowHandles()) { if (!parentWindow.contentEquals(windowHandle)) {
		 * 
		 * break; }
		 */

		System.out.println("Second page handle id" + windowHandle);
	}

}
