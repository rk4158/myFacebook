package selFast1.selFast1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rkshaha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/rkshaha/Downloads/Selenium.html");
		
		Actions act = new Actions(driver);
		
		WebElement m = driver.findElement(By.xpath("//*[@id='commands']"));
		
		Select element = new Select(m);
		boolean b = element.isMultiple();
		System.out.println(b);
		element.selectByVisibleText("SQL Commands");
		element.selectByVisibleText("Unix Commands");
		Thread.sleep(3000);
		element.deselectAll();
		

	}

}
