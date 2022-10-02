package selFast1.selFast1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rkshaha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		WebElement findDates = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceholder1_RadCalendar1_Title']"));
		findDates.click();
		WebElement prev = driver.findElement(By.xpath("//td[@id='rcMView_PrevY']/child::a"));
		prev.click();
		WebElement year = driver.findElement(By.xpath("//a[text()='2017']"));
		year.click();
		WebElement month = driver.findElement(By.xpath("//a[text()='Dec']"));
		month.click();
		WebElement ok = driver.findElement(By.xpath("//a[text()='OK']"));
		ok.click();
		
		By dayLocator = By.xpath("//a[text()='5']");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(dayLocator));
		WebElement day = driver.findElement(dayLocator);
		day.click();
		
		By dateLocator = By.xpath("//span[@id='ctl00_ContentPlaceholder1_Label1']");
		wait.until(ExpectedConditions.textToBe(dateLocator, "Tuesday, December 5, 2017"));
		WebElement datePrint = driver.findElement(dateLocator);
		String text = datePrint.getText();
		System.out.println(text);
		
		

	}

}
