package new_again_one;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Implicit_Waits {

	public static void main(String[] args) {
		
		//Implicit Waits //Explicit Waits //Fluent Waits
		
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://export.ebay.com/in/");
		//cookies declining
		driver.findElement(By.xpath("//*[@id=\"onetrust-reject-all-handler\"]")).click();
		
		
		
		  //Impilicit waits
		
		// implementing implicit waits 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;
		
		//find WebElement Start Selling
		//driver.findElement(By.linkText("Start Selling")).click();
		try {
			watch=Stopwatch.createStarted();
			driver.findElement(By.linkText("Kuch_bhi")).click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds ");
			
		}
		
		
		
	}

}
