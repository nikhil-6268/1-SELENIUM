package new_again_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class counting_hyperlinks {

	public static void main(String[] args) {
		// launching in web browser
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver123\\chromedriver123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//launching website 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on WebPage : " + linkElements.size());
		// printing all names of links 
		for(WebElement links:linkElements)
		{
				System.out.println("The Links are : " + links.getText());
		}
	}

}
