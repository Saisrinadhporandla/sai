package Com.Selenium_FW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.Cart;
import amazon.Landing_WebPage;
import amazon.Log_In;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adding_To_Cart {
	
	@Test
	public void adding() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		Landing_WebPage page =new Landing_WebPage(dr);
		page.url();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Log_In log=new Log_In(dr);
		log.log_In();
		Cart cart=new Cart(dr);
		//Cart cart=new Cart(dr);
		cart.add();
        Thread.sleep(2000);
		WebElement we=dr.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
		Assert.assertTrue(we.isDisplayed(),null);
		dr.close();
	}
	
}

