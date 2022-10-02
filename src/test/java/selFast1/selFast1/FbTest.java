package selFast1.selFast1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class FbTest {
	WebDriver driver;
@BeforeClass
	public void Test() {
		System.setProperty("webdriver.chrome.driver", "/Users/rkshaha/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement createAC = driver.findElement(By.xpath("//*[text()='Create new account']"));
		createAC.click();
	}
//	@Test
//	public void fbTest(String first, String last, String email,  ) {
//		
//	}
//	@DataProvider
//	public Object [][] dataLoader(){
//		
//	}

}
