package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_tool_tip {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.globalsqa.com/demo-site/tooltip/#Forms%20Based"); 
		String actual_tooltip = driver.findElement(By.xpath("//*[@id=\"firstname\"]")) .getAttribute("title");
		
		String expected_tooltip = "Please provide your firstname.";
		if(actual_tooltip.equals(expected_tooltip))
		{
			System.out.println("test passed");
			
		}else {
			System.out.println("test failed");
		}
		
	}

}
