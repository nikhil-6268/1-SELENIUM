package new_again_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class handle_Web_table {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Users/Dell/Desktop/Nikhil/doctype.html");
		
		//Find second cell in the web table and print second table data 
  
		 String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		 System.out.println("text");
		 List<WebElement>rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		 System.out.println("Rows : "+ rowList.size());
		 List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		 System.out.println("Column : "+columnList.size());
		 
		 for(int r = 2;r<=rowList.size();r++)
		 {
			 for(int c=1;c<=columnList.size();c++)
			 {
//				 (By.xpath("//table/tbody/tr[r]/td[c]"))  tr[r]/td[c]<-- here tr[r] is from rowlist i.e, r=2 and td[c] is column from c=1
				 String data = driver.findElement(By.xpath("//table/tbody/tr[" +r+ "]/td[" +c+ "]")).getText();
				 System.out.println(data);
			 }
		 }
		 
    }

		 
}
