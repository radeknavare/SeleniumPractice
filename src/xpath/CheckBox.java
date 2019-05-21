package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<WebElement> checkbox;
		int i;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		checkbox = chromeDriver.findElements(By.className("cb1-element"));
		
		for(i=0; i < checkbox.size(); i++)
		{
			System.out.println(chromeDriver.findElement(By.xpath("//*[class=cb1-element](1)/parent::label")).getText());
			if((chromeDriver.findElements(By.xpath("//*[class=cb1-element]/parent::label")).equals("Option 1")))
			{
				checkbox.get(i).click();
			}
		}
	}

}
