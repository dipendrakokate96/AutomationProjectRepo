package automation_projectdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FourthAutomationProgram {
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.findElement(By.id("name")).sendKeys("Abhinav"); // Name
		driver.findElement(By.id("email")).sendKeys("Abhinav@gmail.com"); // Email
		driver.findElement(By.id("gender")).click(); // Gender
		driver.findElement(By.id("mobile")).sendKeys("1234567890"); // Mobile Number
		driver.findElement(By.id("dob")).sendKeys("01-01-1997"); // DOB
		driver.findElement(By.id("subjects")).sendKeys("Automation Testing"); // Subject
		driver.findElement(By.id("hobbies")).click(); // HOBBIES
		WebElement pic = driver.findElement(By.id("picture"));
		pic.sendKeys("D:\\DemoImage.png"); // File Upload
		driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Greater Noida"); // Current Address
		WebElement staticDropdown = driver.findElement(By.id("state"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Uttar Pradesh"); // State

		WebElement staticDropdown1 = driver.findElement(By.id("city"));
		Select dropdown1 = new Select(staticDropdown1);
		dropdown1.selectByVisibleText("Lucknow"); // City

		driver.findElement(By.xpath("//input[@type='submit']")).click(); // Login
		driver.close(); // Close Driver

		
		
		
	}

}
