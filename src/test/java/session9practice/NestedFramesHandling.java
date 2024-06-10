package session9practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFramesHandling {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.id("name")).sendKeys("Hello Dipendra");// main web page outside the frames

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm3']"))); // control over the frame 3

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']"))); // than control goes over the
																						// inside nested frame 1

		WebElement dropdown = driver.findElement(By.id("course")); // locate the drop down

		// to locate the drop down we have to create the select class object
		Select sd = new Select(dropdown);

		sd.selectByVisibleText("Python"); // select the Python value

		Thread.sleep(3000);

		driver.switchTo().parentFrame(); // control going over the parent frame

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm2']"))); // Control goes over the frame 2 inside the nested frame 3
																						

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("dipendra"); // sending the data inside the frame2
																	

		driver.switchTo().parentFrame(); // control going over the parent frame

		Thread.sleep(3000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Frame 3");// inside the frame 3

		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("main web page"); // main web page

	}

}
