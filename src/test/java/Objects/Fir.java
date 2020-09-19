package Objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fir {
	
	WebDriver driver;
	WebElement rock;
	ArrayList<WebElement> am = new ArrayList<WebElement>();

	
	public Fir(WebDriver driver){
		
		this.driver=driver;
		
		
}
	
	public void add() {
		
		List<WebElement> options =driver.findElements(By.xpath("//h4[@class='product-name']"));
		int count=0;
		
		String[] name = {"Brocolli","Cucumber","Beetroot"};
		
		
		for(int i=0;i<options.size();i++) {
			
			String[] na = options.get(i).getText().split("-");
			
			String format = na[0].trim();
			
			List al = Arrays.asList(name);
			
			
			
			
			if(al.contains(format)) {
				
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(count==3) {
					break;
				}
			}
			
		}	
		
	//	return am;
		
		
		
		
	}
	
	public WebElement click() {
		
		WebElement click=driver.findElement(By.xpath("//a[@class='cart-icon']/img"));
		
		return click;
	}
	
	public WebElement proceed() {
		
		WebElement proceed =driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button"));
		
		return proceed;
	}
	
	

}
