package automation_project_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement dropdownsbtn = driver.findElement(By.id("dropdown-class-example"));
		
		// locate drop downs buttons
		
		Select s  = new Select(dropdownsbtn);
		
		s.selectByIndex(1);
		Thread.sleep(2000);		
		s.selectByValue("option2");
		Thread.sleep(2000);
		s.selectByVisibleText("Option3");
		
		// print drop down options on the console.
		
		List<WebElement> printoptions = s.getOptions();
		
		for(int i=0;i<printoptions.size();i++)
		{
			System.out.println(printoptions.get(i).getText());
		}
		System.out.println();
		
		for(WebElement option : printoptions)
		{
			System.out.println(option.getText());
		}
		
		
		
		driver.quit();
	}

}
