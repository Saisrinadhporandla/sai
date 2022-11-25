package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	WebDriver dr;
	public Cart(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement click5;
	@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'OnePlus 10 Pro | 5G Android Smartphone | 8GB+128GB')]")
	WebElement click6;
	@FindBy(id="add-to-cart-button")
	WebElement click7;
	
	public void add()
	{
		search.sendKeys("one plus 10 pro");
		click5.click();
		click6.click();
		click7.click();
	}
	}
//dr.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 10 pro");
//dr.findElement(By.id("nav-search-submit-button")).click();
//dr.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'OnePlus 10 Pro | 5G Android Smartphone | 8GB+128GB')]")).click();
//dr.findElement(By.id("add-to-cart-button")).click();
