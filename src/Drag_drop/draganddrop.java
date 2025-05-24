package Drag_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");

		driver.manage().window().maximize();

		WebElement	frame1 =	driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(frame1);

		WebElement	from = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));

		WebElement to = driver.findElement(By.id("trash"));

		Actions ref = new Actions(driver);

		ref.dragAndDrop(from, to).build().perform();

		
		
		
		




	}

}
