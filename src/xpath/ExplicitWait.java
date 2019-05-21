package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		chromeDriver.findElement(By.xpath("//a[2]")).click();
		System.out.println(chromeDriver.findElements(By.xpath("//a")).size());
		WebDriverWait wdw = new WebDriverWait(chromeDriver, 20);
		//wdw.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		System.out.println(chromeDriver.findElement(By.id("results")).getText());
		/*WebDriverWait explicitwait = new WebDriverWait(chromedriver,20);
		explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='loading']")));
		System.out.println(chromedriver.findElement(By.xpath("//*[@id='loading']/br[2]")).getText());*/
		
		
		
	}
	
}
