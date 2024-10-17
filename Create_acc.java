package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_acc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
		System.out.println("URL : "+driver.getCurrentUrl());
		driver.findElement(By.id("firstname")).sendKeys("Nikhil");
		driver.findElement(By.name("lastname")).sendKeys("Jaiswal");
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("nikhiljaiswal1113@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Aksh@uhini_18*");
		driver.findElement(By.name("password_confirmation")).sendKeys("Aksh@uhini_18*");
		

	}

}
