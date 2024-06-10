package automation_project_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindow1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);
		System.out.println("Script is waiting for 5 sec");

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> windowhandles = driver.getWindowHandles();

		// Approach1

//       
//        List<String> mylist=new ArrayList(windowhandles);
//       String id_of_parent_window = mylist.get(0);
//       String id_of_child_window = mylist.get(1);
//   
//        driver.switchTo().window(id_of_child_window);

		// Approach2

		for (String wh : windowhandles) {
			String pagetitle = driver.switchTo().window(wh).getTitle();

			if (pagetitle.equals("Human Resources Management Software | OrangeHRM")) {
				System.out.println("clicking on book demo button");
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			}

		}

		// Approach3
      
	}

}
