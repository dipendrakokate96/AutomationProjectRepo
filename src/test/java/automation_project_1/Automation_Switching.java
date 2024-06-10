package automation_project_1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Switching {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

}
