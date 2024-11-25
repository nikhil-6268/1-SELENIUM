package new_again_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_operations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver123\\chromedriver123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
	  WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	  
	  Actions act = new Actions(driver);
	  act.contextClick(button).perform();// right click
//        act.moveToElement(target).perform(); // for moving the cursor to the element
	 
	}

}
