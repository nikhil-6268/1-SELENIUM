package new_again_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_count_hyperlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.calculator.net/"); // url of the testing website
		//finding the lists of the element
		List<WebElement>LinkElements = driver.findElements(By.tagName("a"));
		System.out.println("Total links of WebPage is " + LinkElements.size());
	}

}
