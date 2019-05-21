package xpath;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.seleniumeasy.com/");
		Actions a = new Actions(chromeDriver);
		a.keyDown(Keys.CONTROL).click(chromeDriver.findElement(By.xpath("//*[text()='TestNG']"))).keyUp(Keys.CONTROL).build().perform();
		Set<String> WindowsSet = chromeDriver.getWindowHandles();
		Iterator<String> itr = WindowsSet.iterator();
		String s = "TestNG Tutorials | Selenium Easy";
		while(itr.hasNext())
		{
			chromeDriver.switchTo().window(itr.next());
			
			if(chromeDriver.getTitle().toString().equals(s))
			{
				System.out.println("In if condition "+chromeDriver.getTitle());
				break;
			}
	
				
			
		}
	}

}
