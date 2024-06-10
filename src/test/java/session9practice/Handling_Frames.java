package session9practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import automation_projectdemo.WebDriverManager;

public class Handling_Frames {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.id("name")).sendKeys("Hello Dipendra");

		// WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frm1']"));

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));

		WebElement dropdown = driver.findElement(By.id("course"));

		// to locate the drop down we have to create the select class object
		Select sd = new Select(dropdown);

		sd.selectByVisibleText("Python");

		// shift the driver focus on main body of the web page
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frm2");

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("dipendra");

		// shift the driver focus on main body of the web page
		driver.switchTo().defaultContent();
		
		
		
		//*[@id="post-body-3126553095830633702"]/div[4]/div[4]/h3//following::iframe[1]
		
		

	}

}
