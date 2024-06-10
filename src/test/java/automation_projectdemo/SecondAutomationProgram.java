package automation_projectdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAutomationProgram {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();

		d.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(3000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		System.out.println("First Page Title ---"+d.getTitle());
		System.out.println(d.getWindowHandle());


		d.navigate().to(" https://www.youtube.com/watch?v=PLLbGltmkpE&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV");
		Thread.sleep(3000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		System.out.println("Second Page Title---"+d.getTitle());
		System.out.println(d.getWindowHandle());

		
		d.navigate().back();
		
		Thread.sleep(3000);
		d.navigate().forward();
		d.quit();

	}

}
