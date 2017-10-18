package uiTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

class Suite02_PreencherCadastro {

	@Test
	void testPreencherCadastro() {
		System.setProperty("webdriver.chrome.driver", "C:\\develop\\selenium-3.6.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/registration/");

		WebElement nome = driver.findElement(By.id("name_3_firstname"));
		nome.sendKeys("Bruno");
		
		WebElement sobrenome = driver.findElement(By.id("name_3_lastname"));
		sobrenome.sendKeys("Bruno");
		
		WebElement solteiro = driver.findElement(By.name("radio_4[]"));
		solteiro.click();
		
		WebElement leitura = driver.findElement(By.name("checkbox_5[]"));
		leitura.click();
		
		Select pais = new Select(driver.findElement(By.id("dropdown_7")));
		pais.selectByVisibleText("Brazil");
		
		Select mes = new Select(driver.findElement(By.id("mm_date_8")));
		mes.selectByVisibleText("6");
		
		Select dia = new Select(driver.findElement(By.id("dd_date_8")));
		dia.selectByVisibleText("20");
		
		Select ano = new Select(driver.findElement(By.id("yy_date_8")));
		ano.selectByVisibleText("1985");
		
		WebElement telefone = driver.findElement(By.id("phone_9"));
		telefone.sendKeys("55839999999");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("brunoluna");
		
		WebElement email = driver.findElement(By.id("email_1"));
		email.sendKeys("brunoluna85@gmail.com");
		
		WebElement about = driver.findElement(By.xpath("//*[@id=\'description\']"));
		about.sendKeys("brunoluna85@gmail.com");
		
		WebElement senha = driver.findElement(By.id("password_2"));
		senha.sendKeys("12345678");
		
		WebElement confirmaSenha = driver.findElement(By.id("confirm_password_password_2"));
		confirmaSenha.sendKeys("12345678");
		
		WebElement btSubmit = driver.findElement(By.name("pie_submit"));
		btSubmit.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'post-49\']/div/p")));

		Assert.assertEquals("Thank you for your registration", driver.findElement(By.xpath("//*[@id=\'post-49\']/div/p")));

		driver.quit();

	}

}
