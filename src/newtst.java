

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtst {
	 public static void main( String[] args ) throws InterruptedException {
		 System.setProperty("webdriveriver.chrome.driveriver",
					"C:\\Users\\KarthiKeyan\\eclipse-workspace\\prgm\\jar\\selenium-server-standalone-3.141.59.jar");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
			driver.findElement(By.xpath("//*[@type='text']")).sendKeys("mobiles");
			driver.findElement(By.xpath("//*[@width='20']")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[@class='_3wU53n']"));
	   

}
		
}
