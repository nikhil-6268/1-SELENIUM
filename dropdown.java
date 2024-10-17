package new_again_one;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select dropdown = new Select(element);
		//dropdown.selectByVisibleText("Iceland");
		//dropdown.selectByValue("IND");
		dropdown.selectByIndex(65);
		//we can check how many options we can select at a dropdown options
		if(dropdown.isMultiple()==true)
		{
			System.out.println("DropDown is Multiple");
		}
		else
		{
			System.out.println("DropDown is Not Multiple");
		}
		
		//how to print all items in dropdown
		List <WebElement> alldropdownoptions = dropdown.getOptions();
		System.out.println("Printing all the Countries Name: "+ alldropdownoptions.size());
		for(WebElement options:alldropdownoptions)
		{
			System.out.println(options.getText());
		}
	}

}
