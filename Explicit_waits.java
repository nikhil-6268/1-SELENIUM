package new_again_one;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Explicit_waits {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://export.ebay.com/in/");
		driver.findElement(By.xpath("//*[@id=\"onetrust-reject-all-handler\"]")).click();
		driver.navigate().refresh();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Stopwatch watch = null;
		
		try {
			watch = Stopwatch.createStarted();
			WebElement Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Xyz")));
			Element.click();
		}catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds ");
		}
				
	}

}
