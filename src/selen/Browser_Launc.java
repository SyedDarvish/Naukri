package selen;

import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_Launc {
	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		/*	driver.get("https://www.amazon.in/");
		driver.get("https://www.myntra.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String ref1=driver.getCurrentUrl();
		System.out.println(ref1);
		String ref2=driver.getPageSource();
		System.out.println(ref2);
	   String ref3=driver.getTitle();
		System.out.println(ref3);
		driver.quit();*/

		//	driver.get("https://www.facebook.com/");
		//		String title = driver.getTitle();
		//		System.out.println(title);
		//		String currnturl = driver.getCurrentUrl();
		//		System.out.println(currnturl);

		//    	WebElement login1 = driver.findElement(By.name("login"));
		//    	login1.click();
		//    	System.out.println(login1);
		//    	

		//		login1.click();
		//driver.manage().window().maximize();
		//	driver.get("https://www.myntra.com");
		//  driver.navigate().back();	
		//    driver.navigate().forward();
		//  driver.close();

		//	driver.get("https://www.facebook.com/");

		//	 WebElement  id = driver.findElement(By.id("email"));
		//	    id.sendKeys("syed@gmail.com");
		//	   WebElement password = driver.findElement(By.id("pass")); 
		//	    password.sendKeys("995723143");


		//	driver.get("https://www.instagram.com/");

		//	WebElement finding =	driver.findElement(By.tagName("span"));
		//		boolean displayed = finding.isDisplayed();
		//		System.out.println(" Is element displayed -" +displayed);
		//		
		//	WebElement er =driver.findElement(By.name(""));
		//		   boolean  enabled = er.isEnabled();
		//		System.out.println("Is element Enabled r -" + enabled );


		//	driver.findElement(By.ByXPath(""));

		//		
		//		driver.get("https://www.snapdeal.com/");
		//		
		//		driver.manage().window().maximize();
		//		
		//	
		//		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//             user.sendKeys("mobile");
		//	
		//	WebElement search =	driver.findElement(By.xpath("//span[text()='Search']"));
		//		System.out.println(search);
		//		search.click();


		//	driver.get("https://www.instagram.com/");
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		//	Thread.sleep(10);
		//  driver.manage().window().maximize();
		//		 
		//		System.out.println("Before entering email and password login button is enabled?");
		//		WebElement login = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
		//		boolean enabled = login.isEnabled();
		//	   System.out.println(enabled);
		//		
		//	  
		//	   
		//		System.out.println("After entering email and password login button is enabled?");
		//		
		//		WebElement user = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		//		user.click();
		//		user.sendKeys("syed");
		//		
		//		WebElement password = driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35']"));
		//	   password.sendKeys("995426562");
		//		
		//	   WebElement login1 = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
		//		boolean enable = login1.isEnabled();
		//	   System.out.println(enable);
		//	   
		//	 WebElement showkey =  driver.findElement(By.tagName("button"));
		//	      showkey.clear();
		//	   System.out.println("login button is displayed -" + login1 .isDisplayed());

		//implicit waits

		//	driver.get("https://www.instagram.com/");

		// Screenshot syntax
		//		TakesScreenshot ref = (TakesScreenshot)driver;
		//		
		//		File src = ref.getScreenshotAs(OutputType.FILE);
		//		
		//		File dst = new File ("C:\\Users\\darvi\\selenium_Project\\Screenshots\\fbImg.png");
		//		
		//		FileHandler.copy(src,dst);
		//		
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		//		
		//		//explicit waits
		//		
		//		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));

//
//		driver.get("https://www.facebook.com/");
//
//		driver.manage().window().maximize();
//
//		Date today = new Date();
//		System.out.println(today);
//
//		today.toString().replace("", "_").replace(":", "_");
//		
//	String	datefile   =  today.toString().replace("","_").replace(":", "_");
//
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		FileHandler.copy(screenshot, new File (".//Screenshot//"+datefile  +".png"));
//
//
//     Date today1 =new Date();
//     System.out.println(today1);
//     
//     String todayimg = today1.toString().replace(" ","_").replace(":","_");
//  
//     File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//     
//     FileHandler.copy(sc, new File(".// Screenshot//.png"));
    
     
//     
//      ChromeOptions co = new ChromeOptions();
//      co.addArguments("--start-Maximized");
//      
//    WebDriver driver=new ChromeDriver( co );
      
      
		
//		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
//		
//		driver.manage().window().maximize();
//		
//		List<WebElement> table = driver.findElements(By.xpath("(//table[1]/tbody/tr[2])[1]"));
//		
//		for (WebElement webElement : table) {
//			System.out.println(webElement.getText());
//		}
		    
		  
		  
		//  driver.get("");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		  
		  
		  
		  
		  
		  
		  
		  
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
}























	}



