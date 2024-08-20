package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchLocator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("josephsailo");
		
		driver.findElement(By.id("pass")).sendKeys("joseph");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		if (title.contains("Facebook")) {
			
			System.out.println("Login is successful");
			
			
		}else {
			System.out.println("Login is not successful");
		}
		
		
	}
}
