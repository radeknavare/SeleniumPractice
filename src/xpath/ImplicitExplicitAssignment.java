package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chromedriver = new ChromeDriver();
		chromedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chromedriver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		chromedriver.findElement(By.id("H-destination")).sendKeys("New");
		chromedriver.findElement(By.id("aria-option-0")).click();
		chromedriver.findElement(By.id("H-searchButtonExt1")).click();
		chromedriver.findElement(By.xpath("//*[@id='resultsContainer']//article[1]//a")).click();
		
		
	}

}
