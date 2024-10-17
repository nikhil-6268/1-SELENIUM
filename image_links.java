package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver123\\chromedriver123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://unsplash.com/s/photos/jpg");
		driver.findElement(By.xpath("//img[@title='Mongolian man drinking tradition milk tea inside yurt']")).click();
		
		if(driver.getTitle().equals("Mongolian man drinking tradition milk tea inside yurt stock photo"));
		{
			System.out.println("Test Passed");
		}
	}

}
