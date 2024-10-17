package new_again_one;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Alert_popup {
// Alert Handle with mouse operations
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]"));
		Actions act = new Actions(driver);
		act.contextClick(button).click().perform();
		
//		Switch to alert window and accept the alert 
		 Alert alert = driver.switchTo().alert(); // here we are accepting the alert
		 alert.accept();
		
	}

}
