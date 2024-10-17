package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shorturl.at/4ZQ3f");
		driver.findElement(By.id("email")).sendKeys("nikhiljaiswal1113@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("AKSH@UHINI_18*");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
//		SEARCH PRODUCTS
		driver.get("https://magento.softwaretestingboard.com/men.html");
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a"));
		
		
	}

}
