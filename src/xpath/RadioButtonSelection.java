package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSelection {

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
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		WebElement radio = getRadioButtonObject(chromeDriver,"optradio");
		radio.click();

	}

}
