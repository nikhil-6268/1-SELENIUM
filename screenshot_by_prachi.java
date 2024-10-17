package new_again_one;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot_by_prachi {

	public static <TakeScreenShot> void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		//Full page screenshot
//		driver.get("https://shorturl.at/WiKGw");
//		// step 1 : Convert Webdriver object to TakeScreenShot interface
//		TakeScreenShot screenshot = ((TakeScreenShot)driver);
//		//step 2 : call getScreenshotAs method to create image file
//		File src = ((RemoteWebDriver) screenshot).getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\Dell\\Desktop\\Nikhil\\TESTING\\SELENIUM\\FullScreen.png");
//		FileUtils.copyFile(src, dest);
	//getting screenshot of only specific parts
		driver.get("https://www.pinterest.com/pin/663155113856059426/");
		WebElement section = driver.findElement(By.xpath("//*[@id=\"mweb-unauth-container\"]/div/div/div[1]/div[3]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/img"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Dell\\Desktop\\Nikhil\\TESTING\\SELENIUM\\Partialscreen.png");
		
		FileUtils.copyFile(src,destination);
		
	
		
	}
}









