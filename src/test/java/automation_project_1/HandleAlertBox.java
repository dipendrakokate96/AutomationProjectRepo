package automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement alertbtn = driver.findElement(By.id("alertbtn"));

		alertbtn.click();

		Thread.sleep(3000);

		// print the data over alert box..

		System.out.println(driver.switchTo().alert().getText());

		// to dismiss the alert box..

		driver.switchTo().alert().dismiss();

		// switch control over alert box from main page
		//driver.switchTo().alert().accept();
	}

}
