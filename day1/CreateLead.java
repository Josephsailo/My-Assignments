package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.name("firstName")).sendKeys("Joseph");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		if (title.contains("View Lead")) {
			System.out.println("Title is diplayed correctly");
			
		} else {
            System.out.println("Title is not displayed correctly");
		}
		
	}
}
