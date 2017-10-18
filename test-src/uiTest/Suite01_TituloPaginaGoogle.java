package uiTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Suite01_TituloPaginaGoogle {

	@Test
	void testVerTituloGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\develop\\selenium-3.6.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.google.com");
        
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("teste automatico");
        element.submit();

        Assert.assertEquals("teste automatico - Pesquisa Google", driver.getTitle());
        
        driver.quit();
	}

}
