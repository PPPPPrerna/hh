package quick.ExtentArr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver = null;
	
	Properties prop;
	
	public WebDriver initialize() throws IOException {
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\ExtentArr\\resources\\data.properties");
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 

		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		return driver;
		
	}
}
