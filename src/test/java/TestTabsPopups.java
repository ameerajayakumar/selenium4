import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsPopups {

	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.err.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://gmail.com");
		System.err.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.quit();
	}
}
