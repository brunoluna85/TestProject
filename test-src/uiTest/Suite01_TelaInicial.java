package uiTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.SeleniumManager;

class Suite01_TelaInicial {

	@Test
	void testTC01_AbrirGoogle() {
		System.setProperty("webdriver.gecko.driver","C:\\develop\\selenium-3.6.0\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://www.google.com");
        
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        
        System.out.println("Page title is: " + driver.getTitle());
        
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
        
        System.out.println("Page title is: " + driver.getTitle());
        
        driver.quit();
        
		//fail("Not yet implemented");
	}
	
	@Test
	void testTC02_VerificarTitulo() {
		WebDriver driver = SeleniumManager.initWebDriverFirefox();
        
        driver.get("http://www.way2automation.com/demo.html");
        
        Assert.assertEquals("Welcome", driver.getTitle());
        
        driver.quit();
	}

}
