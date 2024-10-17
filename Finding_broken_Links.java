package new_again_one;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_broken_Links {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","D:\\chromedriver123\\chromedriver123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		//10 seconds wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List <WebElement> linkLists = driver.findElements(By.tagName("a"));
		int ResponseCode= 200; // Valid Links Starter Pack
		int BrokenLinkCNT = 0; // In-Valid or Broken Link Starter Pack 
		System.out.println("Total No.of Links : ");
		for(WebElement element:linkLists)
		{
			String url = element.getAttribute("href");
			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				ResponseCode = huc.getResponseCode();
				if (ResponseCode >=400);
				{
					System.out.println(url + "Link is Not Valid");
					BrokenLinkCNT ++;
				}
				
			}
			catch(MalformedURLException e)
			{
				
			}
			catch(Exception e)
			{
				
			}
			System.out.println("Total No.of Broken Links : " +BrokenLinkCNT);
		}
	}

}
