package automation_project_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsPractice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> radiobuttons = driver.findElements(By.cssSelector("[name='radioButton']"));

		// first Approach to handle radio button in loop..if there is more than one
		// radio button so we locate them by using loop

		// second Approach to handle radio buttons in loop...if there is more than one
		// radio button so we locate them by using loop
		for (WebElement radiobtn : radiobuttons) {

			radiobtn.click();
			Thread.sleep(2000);
			System.out.println(radiobtn.isDisplayed());
			System.out.println(radiobtn.isEnabled());
			System.out.println(radiobtn.isSelected());
		}

		Thread.sleep(2000);

		driver.quit();

	}

}
