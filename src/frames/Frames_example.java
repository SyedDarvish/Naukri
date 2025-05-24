package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_example {
	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/frame");

		driver.manage().window().maximize();

	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.name("fname")).sendKeys("syed");
	    
	     WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		
	     driver.switchTo().frame(frame2);
	     
	     driver.findElement(By.xpath("//input[@class='input']")).sendKeys("syed@gmail.com");
	     
	     driver.switchTo().parentFrame();
	    
	     driver.findElement(By.name("lname")).sendKeys("A");
	
	     
	}}


	
