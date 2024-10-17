package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebook_tooltip {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");
		String Actual_tooltip= driver.findElement(By.xpath("//a[@href=\"/reg/\"]")).getAttribute("title");
		String Expected_tooltip = "Sign up for Facebook"; 
		if(Actual_tooltip.equals(Expected_tooltip))
		{
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
	}

}
