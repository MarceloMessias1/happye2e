package Metodos;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirWebSite(String appUrl, String descricao) {
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void clicar_cookies(String valor) {
		driver.findElement(By.xpath(valor)).click();

	}

	/*
	 * public void entre_no_canal_solicitacoes(String click) {
	 * driver.findElement(By.xpath(click)).click();
	 * 
	 * }
	 * 
	 * public void waiUntil() { driver.manage().timeouts().implicitlyWait(300,
	 * TimeUnit.SECONDS); }
	 */

	public void clico_em_sugestoes(String click) {
		driver.findElement(By.xpath(click)).click();
	}

	public void salvascreenShot(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(". /Evidencias/" + fileName + ".png"));

		try {

		} catch (AssertionError e) {
			String message = e.getMessage();
			System.out.println(message);
			// TODO: handle exception
		}

	}

	public void fecharWebsite() {
		driver.quit();
	}

}
