package session13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticWebTables {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("Rows Count In Table : "+rows.size());
		
		driver.close();
		
		
	}

}
