package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import okio.Timeout;

public class SelectDropDown {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		chromeDriver.findElement(By.xpath("//*[text()='Input Forms']")).click();
		
		chromeDriver.findElement(By.xpath("//*[text()='Input Forms']/following-sibling::ul/li[4]")).click();
		
		Select s = new Select(chromeDriver.findElement(By.id("select-demo")));

		s.selectByValue("Thursday");
	}
}
