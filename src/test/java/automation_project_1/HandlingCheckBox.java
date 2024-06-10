package automation_project_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));

		checkbox1.click();
		System.out.println(" checkbox1  -->"+checkbox1.isDisplayed());
		System.out.println(" checkbox1  -->"+checkbox1.isEnabled());
		System.out.println(" checkbox1  -->"+checkbox1.isSelected());
		System.out.println();

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));

		checkbox2.click();
		System.out.println(" checkbox2  -->"+checkbox2.isDisplayed());
		System.out.println(" checkbox2  -->"+checkbox2.isEnabled());
		System.out.println(" checkbox2  -->"+checkbox2.isSelected());
		System.out.println();

		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));

		checkbox3.click();
		System.out.println(" checkbox3  -->"+checkbox3.isDisplayed());
		System.out.println(" checkbox3  -->"+checkbox3.isEnabled());
		System.out.println(" checkbox3  -->"+checkbox3.isSelected());
		
		
		//driver.quit();

	}

}
