package br.cucumber_tst.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WrapperFactory {

	public static WebDriver Instance = null;
	public static String navegador = "ff";

	public static void Init() {

		if (Instance == null) {
			if (navegador.equalsIgnoreCase("ff")) {
				System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");
				Instance = new FirefoxDriver();
			} else if (navegador.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "src\\main\\resources\\drivers\\IEDriverServer.exe");
				Instance = new InternetExplorerDriver();
			} else if (navegador.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
				Instance = new ChromeDriver();
			}
		}

		Instance.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Instance.manage().window().maximize();
	}

	public static void quit() {
		Instance.close();
	}

}
