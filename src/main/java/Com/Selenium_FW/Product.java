package Com.Selenium_FW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	WebDriver dr;
	public Product(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
//	List<WebElement> products=dr.findElements(By.cssSelector(".mb-3"));
//	WebElement we= products.stream().filter(i->i.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(prod)).findFirst().orElse(null);
//	
//	we.findElement(By.xpath("//button[text()=' Add To Cart']")).click();
//	Thread.sleep(2000);
//	dr.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
    
	
	@FindBy(css=".mb-3")
	List<WebElement> prod;
	
	
	public List<WebElement> produc()
	{
		return prod;
		
	}
	public WebElement search(String name)
	{
		WebElement we= prod.stream().filter(i->i.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(name)).findFirst().orElse(null);
		return we;
	}
	

}
