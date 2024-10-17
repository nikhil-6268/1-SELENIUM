package new_again_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class counting_radio_button {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver123\\chromedriver123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		List <WebElement> RadioBtnList = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total No.of Radio Button available on Web Pages are : "+RadioBtnList.size());
		
		
	}

}
