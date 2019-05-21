package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.Select;


public class Locaters {
	
	static WebElement getRadioButtonObject(WebDriver chromeDriver, String Name)
	{
		List<WebElement> radioButton;
		int i;
		radioButton = chromeDriver.findElements(By.name(Name));
		
		for(i=0; i< chromeDriver.findElements(By.name(Name)).size(); i++)
		{
			String check = radioButton.get(i).getAttribute("value");
			if(check.equals("Male"))
			{
				break;
			}
		}
		return radioButton.get(i);
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		chromeDriver.findElement(By.xpath("//*[text()='Input Forms']")).click();
		
		chromeDriver.findElement(By.xpath("//*[text()='Input Forms']/following-sibling::ul/li[4]")).click();
		
		//chromeDriver.findElement(By.className("site-name")).click();
		//chromeDriver.navigate().back();
		//chromeDriver.navigate().forward();
		Actions a = new Actions(chromeDriver);
		//a.keyDown(Keys.CONTROL).click(chromeDriver.findElement(By.xpath("//*[text()='Selenium Easy']"))).build().perform();
		a.keyDown(Keys.CONTROL).click(chromeDriver.findElement(By.xpath("//*[contains(text(),'Selenium Easy')]"))).build().perform();
		//a.keyDown(Keys.CONTROL).click(chromeDriver.findElement(By.cssSelector("[title$='Home']"))).build().perform();
		//chromeDriver.findElement(By.xpath("//*[text()='Radio Buttons Demo']")).click();
		//chromeDriver.close();
		
		//WebElement radio = getRadioButtonObject(chromeDriver,"optradio");
		//radio.click();
		
		Select s = new Select(chromeDriver.findElement(By.id("select-demo")));
		s.selectByValue("Thursday");
		}	
}
