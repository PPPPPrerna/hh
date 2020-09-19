package quick.ExtentArr;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Objects.Fir;
import Objects.Proceed;
import quick.ExtentArr.Base;

public class FirstTest extends Base{
	
	WebDriver driver;
	ArrayList<WebElement> we = new ArrayList<WebElement>();
	
	Logger log = LogManager.getLogger();
	
	
	@Parameters({"url"})
	@BeforeClass
	public void first(String url) throws IOException {
		
		this.driver=initialize();
		
		driver.get(url);
		
//String value = prop.getProperty("url");
		
		//driver.get(value);
		
		
		
		
		
}
	
	
	@Test(dataProvider = "getData")
	
	public void start(String code , String cntry  ) {
		
		
		
		
		Fir fi = new Fir(driver);
		
		fi.add();
		
		//for(int i=0;i<we.size();i++) {
			
			//we.get(i).click();
			
		//}
		
		fi.click().click();
		fi.proceed().click();
		Proceed pro = new Proceed(driver);
		pro.proc().sendKeys(code);
		
		log.info("keys sent");
		
		
		pro.apply().click();
		log.info("applied");

		pro.place().click();
		
		pro.country().selectByValue(cntry);
		
		pro.check().click();
		pro.proced().click();
	}
	

	
	@DataProvider
	public Object[][] getData() {
		
		Object ob[][] = new Object[1][2];
		ob[0][0]="rahulshettyacademy";
		ob[0][1]="Australia";
		
		return ob;
	}
	
	@Test(dependsOnMethods = {"start"} , enabled = false)
	public void finalClose() {
		
		driver.close();
	}
	
	}

