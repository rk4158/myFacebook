package selFast1.selFast1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	WebDriver driver;
	@BeforeClass
	public void driverLoad() {
		System.setProperty("webdriver.chrome.driver", "/Users/rkshaha/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/rkshaha/Downloads/geckodriver");
	}
	@Parameters("browser")
	@Test
	public void test(String browserName) {
		if(browserName.equalsIgnoreCase("ff")) {
			driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
		}
		else if(browserName.equalsIgnoreCase("gc")) {
			driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
		}
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	

}
