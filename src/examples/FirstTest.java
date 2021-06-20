package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Vital_Files\\Automation_Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("guru 99");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Selenium Tutorial")).click();
		driver.findElement(By.cssSelector(".g-logo")).isDisplayed();
//		if(title=="Google") {
//			System.out.println("Hey page is google");
//		}else {
//			System.out.println("Something went wrong!!");
//		}
		driver.close();
	}

}
