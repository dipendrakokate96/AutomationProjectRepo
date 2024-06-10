package automation_projectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdAutomationProgram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement firstname = d.findElement(By.id("name"));
		
		firstname.click();
		firstname.sendKeys("dipendra");
		Thread.sleep(4000);
				
		WebElement Email = d.findElement(By.id("email"));
		
		Email.click();


		Email.sendKeys("dipendrakokate11mail.com");
		Thread.sleep(3000);
		
		
		WebElement Mobile = d.findElement(By.name("mobile"));
		
		Mobile.click();
		
		Mobile.sendKeys("9165258913");
		
		WebElement Date_Of_Birth = d.findElement(By.id("dob"));
		
		Date_Of_Birth.click();
		
		Date_Of_Birth.sendKeys("24-10-1997");
		

		WebElement Subjects = d.findElement(By.id("subjects"));
		
		Subjects.click();
		
		Subjects.sendKeys("Math");
		
		//Thread.sleep(2000);
		
		WebElement Current_Address = d.findElement(By.xpath("//textarea[@id='picture']"));
		
		//Current_Address.click();
		
		Current_Address.sendKeys("Chintamani Chowk,Akurdi");
		
		
		//d.close();

		
	}
}
