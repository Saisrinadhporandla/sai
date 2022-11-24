package Com.Selenium_FW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	WebDriver dr;
	public CheckOut(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
//	  dr.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
//	    dr.findElement(By.cssSelector("input[placeholder='Select Country']")).sendKeys("ind");
//	    List<WebElement> coun=dr.findElements(By.xpath("//section/button"));
//	   Thread.sleep(2000);
//	   for(WebElement opt : coun)
//	   {
//		   if(opt.getText().equalsIgnoreCase("India"))
//			{
//				opt.click();
//				break;
//			}
//      
//		}
//	   dr.findElement(By.className("btnn action__submit ng-star-inserted")).click();
//    
	
	@FindBy(xpath="//button[normalize-space()='Checkout']")
	WebElement check;
	@FindBy(css="input[placeholder='Select Country']")
	WebElement countrySelect;
	@FindBy(xpath="//section/button")
	List<WebElement> countryName; 
	@FindBy(xpath="//a[normalize-space()='Place Order']")
	WebElement placeOrder;
	
	public void india() throws InterruptedException
	{
		check.click();
		countrySelect.sendKeys("ind");
		Thread.sleep(2000);
		for(WebElement opt : countryName)
		{
			if(opt.getText().equalsIgnoreCase("India"))
			{
				opt.click();
				break;
			}
		}
		placeOrder.click();
			
	}
	
	

}
