package Com.Selenium_FW;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standolone_Test2_Copy {
	@SuppressWarnings("deprecation")
	@Test

	 public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/client");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String name="zara coat 3";
		dr.findElement(By.id("userEmail")).sendKeys("dinga@gmail.com");
		dr.findElement(By.id("userPassword")).sendKeys("Dinga@1438");
		dr.findElement(By.id("login")).click();
		List<WebElement> products=dr.findElements(By.cssSelector(".mb-3"));
		WebElement we= products.stream().filter(i->i.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(name)).findFirst().orElse(null);
		Cart_Fun cart=new Cart_Fun(dr);
		List<WebElement> itemsIn=cart.car();
		we.findElement(By.xpath("//button[text()=' Add To Cart']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
	    //
	    List<WebElement> fi=dr.findElements(By.xpath("//div[@class='cartSection']/h3"));
	    boolean asse=itemsIn.stream().anyMatch(i->i.getText().equalsIgnoreCase(name));
	    Assert.assertTrue(asse);
	    dr.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
	    dr.findElement(By.cssSelector("input[placeholder='Select Country']")).sendKeys("ind");
	    List<WebElement> coun=dr.findElements(By.xpath("//section/button"));
	   Thread.sleep(2000);
	   for(WebElement opt : coun)
	   {
		   if(opt.getText().equalsIgnoreCase("India"))
			{
				opt.click();
				break;
			}
        
		}
	   dr.findElement(By.className("btnn action__submit ng-star-inserted")).click();
	    CheckOut checkout =new CheckOut(dr);
	    checkout.india();                                
	}

}
