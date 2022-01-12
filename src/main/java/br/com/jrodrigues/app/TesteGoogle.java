package br.com.jrodrigues.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Teste Selenium Web Driver
 */
public class TesteGoogle 
{
    public static void main( String[] args )
    {
		System.setProperty("webdriver.gecko.driver", "D:\\Desenv\\driver\\selenium-driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
    }
}
