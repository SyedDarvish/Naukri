package Advanced_selenium;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	          
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Beauty']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sunscreen']")).click();
		
		
		
	//	driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
//		
//		List<WebElement> list1=driver.findElements(By.xpath("//span[@class='_cDEzb_p13n-sc-price_3mJ9Z']"));
//	     for (WebElement webElement : list1) {
//			String text  = webElement.getText();
//			String price =text.replaceAll("rs ", "");
//			int a = Integer.parseInt(price);
//			List<Integer> list=new ArrayList<>();
//			list.add(a);
		//  System.out.println(text);
		  
			
		}
		
	// System.out.println();
	}


