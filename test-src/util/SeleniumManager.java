package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumManager {

	public static WebDriver initWebDriverFirefox() {
		System.setProperty("webdriver.gecko.driver","C:\\develop\\selenium-3.6.0\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
	}
}
