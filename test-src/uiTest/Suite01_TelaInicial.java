package uiTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

class Suite01_TelaInicial {

	@Test
	void testTC01_VerificarTitulo() {
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

}
