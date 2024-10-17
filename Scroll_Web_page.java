package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Web_page {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// VERTICAL SCROLL
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Scroll Vertically Down by 500 pixels
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,1000)");
		
//		Scroll till visibility of web element
		WebElement element = driver.findElement(By.linkText("BMI Calculator")); 
		js.executeScript("arguments[0].scrollIntoView()", element);
		Actions Act = new Actions(driver);
		Act.contextClick(element).perform();
		
		//To Scroll down the Web page at the bottom of the web page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//Horizontal Scroll
		WebElement element1 = driver.findElement(By.id(""));
		js.executeScript("arguments[0].scrollIntoView();",element1);
		
	}

}
