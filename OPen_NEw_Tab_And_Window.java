package new_again_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPen_NEw_Tab_And_Window {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("First Page: " + driver.getTitle());
		
		// opening new tab or new window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("Second Tab: " + driver.getTitle());
		
		// get window handles of open windows 
		Set <String>windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		//driver.close();
		driver.switchTo().window(handles.get(0));//switch to google.com
		System.out.println("First Page: " + driver.getTitle());
		
	}

}
