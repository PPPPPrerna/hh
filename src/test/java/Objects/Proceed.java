package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Proceed {
	
	WebDriver driver;
	
	public Proceed(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement proc() {
		
		WebElement pro = driver.findElement(By.xpath("//input[@class='promoCode']"));
		return pro;
	}
	
	public WebElement apply() {
		
			WebElement aply =driver.findElement(By.xpath("//button[@class='promoBtn']"));
			
			return aply;
	}

	public WebElement place() {
		
		WebElement order =driver.findElement(By.xpath("//button[text()='Place Order']"));
		
		return order;
	}
	
	public Select country() {
		WebElement count = driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select"));
		Select sd = new Select(count);
		return sd;
		
		
	}
	
	public WebElement check() {
		
		return driver.findElement(By.xpath("//input[@class='chkAgree']"));
	}
	
	public WebElement proced() {
		return driver.findElement(By.xpath("//div[@class='wrapperTwo']/button"));
	}
}
