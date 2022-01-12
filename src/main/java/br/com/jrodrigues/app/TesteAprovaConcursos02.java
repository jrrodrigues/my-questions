package br.com.jrodrigues.app;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import junit.framework.Assert;
/**
 * Teste Selenium Web Driver
 */
public class TesteAprovaConcursos02 
{
	@Test
    public void teste()
    {
//		System.setProperty("webdriver.gecko.driver", "/Users/wcaquino/Downloads/geckodriver");
//		System.setProperty("webdriver.chrome.driver", "/Users/wcaquino/Downloads/chromedriver");
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();

    	System.setProperty("webdriver.gecko.driver", "D:\\Desenv\\driver\\selenium-driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.aprovaconcursos.com.br/questoes-de-concurso/questoes/banca/cebraspe-cespe/nivel/superior-completo/quantidade-por-pagina/200");
		//System.out.println(driver.getTitle());
		
		driver.manage().window().setSize(new Dimension(1200, 765));
		//Assert.assertEquals("Questões de Concurso – Aprova Concursos", driver.getTitle());
		
		
		driver.findElement(By.id("filtrar")).click();
		
		//driver.findElement(By.id("s2id_autogen2")).sendKeys("Cebraspe (Cespe)");
		//driver.findElement(By.linkText("Cebraspe (Cespe)")).click();

		//driver.findElement(By.id("s2id_autogen8")).sendKeys("Superior");
		//driver.findElement(By.linkText("Superior Completo")).click();

		
/*		
		WebElement element = driver.findElement(By.id("s2id_autogen2"));
		Select combo = new Select(element);
//		combo.selectByIndex(2);
//		combo.selectByValue("superior");
		combo.selectByVisibleText("Cebraspe (Cespe)");
		
		//Assert.assertEquals("Cebraspe (Cespe)", combo.getFirstSelectedOption().getText());
*/
		//driver.quit();
    }
}
