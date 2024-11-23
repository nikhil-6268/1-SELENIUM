package DemoTest.Test1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


	public class Automate_Date_Picker {

		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "D:\\BrowserDriver\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			String expectedDay = "20";	
			String expectedMonth = "July";
			String expectedYear = "2022";
			
			driver.get("https://jqueryui.com/datepicker/");
			
			//Switching to iframe
			driver.switchTo().frame(0);
			
			//finding date picker webelement to perform click actions
			//Another click actions method
			
			WebElement datePicker = driver.findElement(By.id("datepicker"));
			datePicker.click();
			
			// Methods to insert date automatically 
			//line no. 23 is using automation 
			//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
			//Finding Calendar Month,Year And,Day(date)
			
			while(true)
			{
			String CalendarMonth =	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String CalendarYear  = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();			;
			if(CalendarMonth.equals(expectedMonth) && CalendarYear.equals(expectedYear))
			{
				
				List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement e:daysList)   
				{
					String CalendarDay = e.getText();
					if(CalendarDay.equals(expectedDay))
					{
						e.click();
						break;
									}
						
					
							}
				break;
					}
				else
			{
					driver.findElement(By.xpath("class=\"ui-icon ui-icon-circle-triangle-e\"")).click();
				}
			
			}
			
		}
	}

