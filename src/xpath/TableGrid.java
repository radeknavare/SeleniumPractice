package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navarked\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.cricbuzz.com/live-cricket-scorecard/19356/ban-vs-sl-2nd-test-sri-lanka-tour-of-bangladesh-2018");
		WebElement table = chromeDriver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int RowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		String text;
		int sum=0;
		for(int i=0; i< RowCount-2 ; i++)
		{
			text = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			System.out.println(text);
			sum+=Integer.parseInt(text);
			
		}
		System.out.println("Sum is : "+sum);
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)")).get(RowCount-1).getText());
	}

}
