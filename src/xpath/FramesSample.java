package xpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://the-internet.herokuapp.com/nested_frames");
		chromeDriver.switchTo().frame("frame-top");
		chromeDriver.switchTo().frame("frame-left");
		System.out.println(chromeDriver.findElement(By.xpath("//body")).getText());
		chromeDriver.switchTo().parentFrame();
		File screenshot = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("C:\\Users\\navarked\\screenshot.jpeg"));
	}

}
