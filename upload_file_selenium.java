package new_again_one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class upload_file_selenium {

	public static void main(String[] args) throws AWTException {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
//		driver.findElement(By.xpath("//input[@id=\"uploadFile\"]")).sendKeys("C:\\Users\\Dell\\Desktop\\Nikhil\\TESTING\\SELENIUM\\locators.txt");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		Robot rb = new Robot();
		rb.delay(5000);
		StringSelection ss = new StringSelection("C:\\Users\\Dell\\Desktop\\Nikhil\\TESTING\\SELENIUM\\locators.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,ss);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}
