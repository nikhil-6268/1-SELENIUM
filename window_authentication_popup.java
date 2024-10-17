package new_again_one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_authentication_popup {

	public static void main(String[] args) {
		//LAUNCHING BROWSER
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
//		driver.get("https://the-internet.herokuapp.com/basic_auth"); //LINK FOR ONLY LINK 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//Link for admin and password in-built here admin is username and admin@is password

	}

}
