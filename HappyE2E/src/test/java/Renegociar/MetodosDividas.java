package Renegociar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDividas {

	WebDriver driver;

	public void abrirWebSite(String appUrl, String descricao) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void clicar_renegociar_divida(String valor) {
		driver.findElement(By.xpath(valor)).click();

	}
}