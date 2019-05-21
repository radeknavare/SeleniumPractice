package xpath;

import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.makemytrip.com/");
		
		chromeDriver.findElement(By.id("hp-widget__sfrom")).clear();
		chromeDriver.findElement(By.id("hp-widget__sfrom")).sendKeys("Pun");
		int size = chromeDriver.findElements(By.xpath("//*[@class='autoCompleteItem__label']")).size();
		for(int i =0; i< size; i++)
		{
			System.out.println(chromeDriver.findElements(By.xpath("//*[@class='autoCompleteItem__label']")).get(i).getText());
			String st = chromeDriver.findElements(By.xpath("//*[@class='autoCompleteItem__label']")).get(i).getText();
			String arr[] = st.split(",");
			if(arr[0].equals("Chennai"))
			{
				System.out.println("Token " + arr[0]);
			}
			
		}
		
	}

}
