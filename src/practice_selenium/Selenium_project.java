package practice_selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.input.Input;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Selenium_project {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://practice.automationtesting.in/");	

		driver.manage().window().maximize();

		Actions ref = new Actions(driver);

		String page1 = driver.getWindowHandle();

		WebElement	element = driver.findElement(By.xpath("//*[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[1]"));

		ref.scrollToElement(element).build().perform();

		element.click();

		String page2  = driver.getWindowHandle();

		driver.switchTo().window(page2);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//a[text()='View Basket']")).click();

		String page3 = driver.getWindowHandle();

		driver.switchTo().window(page3);

		Actions ref2 = new Actions(driver);

		WebElement checkout =  driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));

		ref2.scrollToElement(checkout).build().perform();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",checkout);

		String page4 = driver.getWindowHandle();

		driver.switchTo().window(page4);

		driver.findElement(By.id("billing_first_name")).sendKeys("syed");

		driver.findElement(By.id("billing_last_name")).sendKeys("A");

		driver.findElement(By.id("billing_email")).sendKeys("syed@gmail.com");

		driver.findElement(By.id("billing_phone")).sendKeys("9952755204");

		driver.findElement(By.id("billing_address_1")).sendKeys("No:346,Avadi");

		driver.findElement(By.id("billing_city")).sendKeys("chennai");
	
		driver.findElement(By.id("billing_postcode")).sendKeys("600054");
		
		js.executeScript("window.scrollBy(0,300)");
		
     WebElement ref3 =  driver.findElement(By.id("s2id_billing_state"));
        
   js.executeScript("arguments[0].click();",ref3);
       
    ref2.scrollToElement(ref3).build().perform();
////     
////     
      ref3.click();
////
//		List<WebElement>state =	driver.findElements(By.xpath("//ul[@role='listbox']/li/div/span"));
////	    
//       System.out.println(state.size());
////		
		WebElement State1 = driver.findElement(By.xpath("//div[text()='Tamil Nadu']"));
// // 	WebElement State1 = driver.findElement(By.xpath("(//ul[@role='listbox']/li/div/span)[24]"));
//	     
		
//		for(WebElement text:state) {
//			
//		if(text == State1) {
//			System.out.println("is there");
//		}else
//		{
//			System.out.println("not there				");
//		}
//		}
		Thread.sleep(2000);
		State1.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,600)");
		
		
		
	//	WebElement Slct = driver.findElement(By.tagName("select"));
	//	js.executeScript("arguments[0].click();",state);
		
	//	Select choose = new Select(state);
	//	choose.selectByValue("TN");
		
	//	ref2.scrollToElement(state).build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[10]/div/a/span[1]"));
	//	driver.findElement(By.id("select2-result-label-62"));
//		
//	for(WebElement text:state) {
//			if(text.equals(State1)) {
//				text = driver.switchTo().activeElement();
//		
			//	driver.findElement(By.id("payment"));
				
			//	driver.findElement(By.xpath("//ul[@class='wc_payment_methods payment_methods methods']")).click();
				
			//	driver.findElement(By.xpath("(//*[@id=\"payment\"]/ul/li/label)[3]")).click();
				
		 //  WebElement page = driver.findElement(By.xpath("//iframe[@name='google_esf']"));
		 
                  //     driver.switchTo().frame(page);
	                	   
			//	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[2]/div/div/input[1]")).click();
		 driver.get(driver.getCurrentUrl());   	
		WebElement 		placeorder	= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[2]/div/div/input[1]"));
		  js.executeScript("arguments[0].click();",placeorder);
				
		    //    placeorder.click();
		        Thread.sleep(3000);
		        driver.findElement(By.id("billing_first_name")).sendKeys("syed");

				driver.findElement(By.id("billing_last_name")).sendKeys("A");

				driver.findElement(By.id("billing_email")).sendKeys("syed@gmail.com");

				driver.findElement(By.id("billing_phone")).sendKeys("9952755204");

				driver.findElement(By.id("billing_address_1")).sendKeys("No:346,Avadi");

				driver.findElement(By.id("billing_city")).sendKeys("chennai");
			
				driver.findElement(By.id("billing_postcode")).sendKeys("600054");
				 js.executeScript("arguments[0].click();",placeorder);
		        
		        
	}
			}
	
		


	

