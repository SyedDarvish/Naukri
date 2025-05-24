package drop_down;    //  Dropdown and ismultiple selecting of webelements.

import java.sql.Ref;  
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class com_Drpdown {
	
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	 
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
	driver.manage().window().maximize();
	
	WebElement ref = driver.findElement(By.tagName("select"));
	
	Select choose = new Select(ref);
	
	choose.selectByValue("DZA");
	
	choose.selectByVisibleText("Belgium");
	
	choose.selectByIndex(7);
	
     driver.get("https://demoqa.com/select-menu/");
     
     driver.manage().window().maximize();
     
         WebElement multilpeslct = driver.findElement(By.id("cars"));
     
        Select selectall = new Select(multilpeslct);
        
        selectall.selectByIndex(0);
        selectall.selectByIndex(1);
        selectall.selectByIndex(2);
        selectall.selectByIndex(3);
        
	
               
                       
        
}}
	
	
