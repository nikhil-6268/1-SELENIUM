package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shipping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/checkout/#shipping");
		
//		First-Name
		driver.findElement(By.name("firstname")).sendKeys("Nikhil");
		
//		Last-Name
		driver.findElement(By.xpath("//*[@id=\"LWP39TL\"]")).sendKeys("Jaiswal");
		
		
//		Street Address
		driver.findElement(By.xpath("//*[@id=\"IJJFOMY\"]")).sendKeys("Colaba,Machi Maar Nagar,Fort 400001");
	}

}
