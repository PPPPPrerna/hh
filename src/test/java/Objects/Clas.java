package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clas {
	
	WebDriver driver;
	
	public Clas(WebDriver driver) {
		
	this.driver=driver;	
	}
	
	public WebElement select() {
		
		WebElement sel =driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select"));
		
		return sel;
	}

}
