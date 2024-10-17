package Demo.WebDriverMgr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMgrClass {

	public static void main(String[] args) {
		//We have to add webdriver manager dependency in pom.xml file of same project the link for this is :- webdrivermanager maven and paste it on the xml file
//		chrome driver
//		 System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver-win64\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
//		 Microsoft edge driver
//		 System.setProperty("webdriver.edge.driver","D:\\New folder\\edgedriver_win64\\msedgedriver.exe");	
// 		 WebDriver driver = new EdgeDriver();
		
		//No need of line no. 12 to 17 we can directly use or start from line no.20
//		 LAUNCHING ALL BROWSER AT ONCE IN A PARALLEL FORMAT BY USING WEB DRIVER MANAGER
//		 WebDriverManager.edgedriver().setup(); // for Microsoft driver
//		 WebDriver driver = new EdgeDriver();
//		 WebDriverManager.firefoxdriver();
//		 WebDriver driver = new firefoxDriver();
		 WebDriverManager.chromedriver().setup(); // chrome for chrome driver
		 WebDriver driver = new ChromeDriver();	 // use webdriver and new browser driver
		 driver.get("https://www.google.com/");
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.youtube.com/");
		 
	}

}
