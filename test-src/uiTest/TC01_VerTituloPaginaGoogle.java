package uiTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_VerTituloPaginaGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\develop\\selenium-3.6.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.google.com");
        
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("teste automatico");
        element.submit();
        
        System.out.println("Titulo da pagina eh: " + driver.getTitle());
        
        Assert.assertEquals("teste automatico - Pesquisa Google", driver.getTitle());
        if (driver.getTitle().equals("teste automatico - Pesquisa Google"))
        	System.out.println("=========== Sucesso! ===========");
        else
        	System.out.println("=========== Falha ===========");
        
        driver.quit();
	}

}
