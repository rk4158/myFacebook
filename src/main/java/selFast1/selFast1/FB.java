package selFast1.selFast1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rkshaha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		WebElement first = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		first.sendKeys("Rubel");
		WebElement last = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		last.sendKeys("Shaha");
		WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		user.sendKeys("shahar415899r");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
		pass.sendKeys("R@415899r");
		WebElement conpass = driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
		conpass.sendKeys("R@415899r");
		WebElement next = driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));
		next.click();
		

	}

}
