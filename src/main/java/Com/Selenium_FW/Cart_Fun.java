package Com.Selenium_FW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Fun {
	WebDriver dr;
	public Cart_Fun(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	//we.findElement(By.xpath("//button[text()=' Add To Cart']")).click();
	//Thread.sleep(2000);
//	dr.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
//    List<WebElement> fi=dr.findElements(By.xpath("//div[@class='cartSection']/h3"));
    
	
	@FindBy(xpath="//button[text()=' Add To Cart']")
	WebElement add;
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement cartSection;
	@FindBy(xpath="//div[@class='cartSection']/h3")
	List<WebElement> itemsInCart; 
	
	public List<WebElement> car() throws InterruptedException
	{
		add.click();
		Thread.sleep(5000);
		cartSection.click();
		return itemsInCart;
	}
	
//	dr.findElement(By.id("userEmail")).sendKeys("dinga@gmail.com");
//	dr.findElement(By.id("userPassword")).sendKeys("Dinga@1438");
//	dr.findElement(By.id("login")).click();
	

}
