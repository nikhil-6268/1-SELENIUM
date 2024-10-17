package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class one_try {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shorturl.at/lTX37");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div[2]/div/a[1]/div[1]/div/div/img"));
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
		System.out.println("URL : "+driver.getCurrentUrl());
		
		}

}
