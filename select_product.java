package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class select_product {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shorturl.at/Ix2c9");
		driver.findElement(By.xpath("https://shorturl.at/6JSzL"));

//		Size
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[5]/div"));
		
//		Colour
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[3]/div[2]/div/div/a[1]/div"));

	}

}
