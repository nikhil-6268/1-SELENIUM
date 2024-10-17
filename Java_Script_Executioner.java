/* What is JavaScriptExecutor
JavaScriptExecutor is an Interface that helps to execute JavaScript
through Selenium Webdriver.
Syntax
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript(Script, Arguments);
Script - This is the JavaScript that needs to execute.
Arguments – It is the arguments to the script. It's optional.
Returns - could be anything from Boolean, Long, String, List,
WebElement, or null. */


package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java_Script_Executioner {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("document.getElementByxpath('Enter xpath').value='text to be entered';");
		// for finding ui element 
		WebElement element = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[1]/td[1]"));
		js.executeScript("arguments[0].click();",element);
/*// Mouse Operations
		WebElement button = driver.findElement(By.className("btn btn-primary"));
		Actions act = new Actions((WebDriver) button);
		act.contextClick(button).perform(); */
		
		//refresh browser
		js.executeScript("history.go[0]");
		 
		// get domain name
		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain : " + domainName);
		
		// get title name
				String title = js.executeScript("return document.title;").toString();
				System.out.println("Title : " + title);
				
		// get url name
				String UrlName = js.executeScript("return document.URL;").toString();
				System.out.println("URL : " + UrlName);
				
		// draw border around web-element
				//WebElement wbelment = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button"));
			//	js.executeScript("arguments[0].style.border = '3px solid red';",wbelment);
				
				//Zoom 50% 
			//	js.executeScript("document.body.style.zoom='50%'");
				
				//		To get the Height and Width of a web page
				//System.out.println(js.executeScript("return window.innerHeight;").toString());
				//System.out.println(js.executeScript("return window.innerWidth;").toString());
				
				//Scroll Vertically Till End
//				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//				
//				//Scroll Vertically Page-Up
//				js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//				
//				//Alert Pop-Up Message 
//				js.executeScript("alert('This is My Alert Pop-Up Message')");
//				
//				//To Navigate to a different page 
//				js.executeScript("window.location = ('http://www.google.com')");
				
			
	}
	
}


