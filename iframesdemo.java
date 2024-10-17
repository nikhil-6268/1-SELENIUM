package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframesdemo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.rediff.com/");
//		// switch to iframe moneyiframe
//		driver.switchTo().frame("moneyiframe");
//		//Find Web-Element and Print Value
//		String nseindex = driver.findElement(By.id("nseindex")).getText();
//		System.out.println(nseindex);
		
		
		// demo2
		driver.get("https://ui.vision/demo/webtest/frames/");
		//Switch to 1st Frame
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext4")).click(); 
		
	}

}
