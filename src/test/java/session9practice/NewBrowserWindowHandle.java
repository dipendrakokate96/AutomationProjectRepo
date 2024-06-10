package session9practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBrowserWindowHandle {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		String phandle = driver.getWindowHandle();

		System.out.println("Parent Window Handle : " + phandle);
		
		

		driver.findElement(By.id("newWindowBtn")).click();
		driver.manage().window().maximize();

		Set<String> chandle = driver.getWindowHandles();

		for (String handle : chandle) {
			System.out.println("Child Window Handle : " + chandle);
			if (!handle.equals(chandle)) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Dipendra");
				Thread.sleep(3000);
			}
		}

		driver.close();
	}
}
