package automation_projectdemo_lecture3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		// locating Name text..
		WebElement Nametext = driver.findElement(By.xpath("//label[@for='name']"));

		System.out.println(Nametext.isDisplayed());

		System.out.println(Nametext.getText());

		// locating Name Text Field
		WebElement NametextField = driver.findElement(By.xpath("//*[@id=\"name\"]"));

		NametextField.sendKeys("Dipendra");

		System.out.println(NametextField.getAttribute("value"));

		// locating Email Text
		WebElement emailtext = driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[2]/label"));

		System.out.println(emailtext.isDisplayed());
		System.out.println(emailtext.getText());

		// locating Email Text field
		WebElement emailtextfeild = driver.findElement(By.xpath("//input[@id=\"email\"]"));

		System.out.println(emailtextfeild.isDisplayed());
		System.out.println(emailtextfeild.isEnabled());

		emailtextfeild.click();

		Thread.sleep(3000);

		emailtextfeild.sendKeys("dipendrakokate2@gmail.com");
		System.out.println(emailtextfeild.getAttribute("value"));

	}

}
