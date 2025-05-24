package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_com {
	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.selenium.dev/selenium/web/alerts.html");
		 
		 driver.manage().window().maximize();
		 
		WebElement ref = driver.findElement(By.id("alert"));
		 
		 ref.click();
		 
		driver.switchTo().alert().accept();
		 
		WebElement ref2 = driver.findElement(By.xpath("//*[@id='confirm']"));
		 
		 ref2.click();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().alert().dismiss();
		 
		 WebElement ref3 = driver.findElement(By.id("prompt-with-default"));
		 ref3.click();
		 
		 Thread.sleep(3000);
		 
		Alert ref4 = driver.switchTo().alert();
		
	String store =	ref4.getText();
		System.out.println(store);
		
		
		
		
	}}
		 
		 
		 
		 
		 
	
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


