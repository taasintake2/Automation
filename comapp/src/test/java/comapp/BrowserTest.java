package comapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static void main(String[] args) {
//WebDriver driver = new ChromeDriver();
//driver.get("https://maven.apache.org/");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://maven.apache.org/");
		driver.close();
		driver.quit();
	}
	

}
