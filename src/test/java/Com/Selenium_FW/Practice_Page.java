package Com.Selenium_FW;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Page {
	@SuppressWarnings("deprecation")
	@Test
	 public void Commerse() throws InterruptedException {
		WebDriverManager.edgedriver().setup();;
		WebDriver dr=new EdgeDriver();
		Login_Function lf=new Login_Function(dr);
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lf.goTo();
		String name="zara coat 3";
		lf.ac("dinga@gmail.com", "Dinga@1438");
		Product pr=new Product(dr);
		Product product=new Product(dr);
		WebElement we=product.search(name);
		Cart_Fun cart=new Cart_Fun(dr);
		List<WebElement> itemsIn=cart.car();
	    boolean asse=itemsIn.stream().anyMatch(i->i.getText().equalsIgnoreCase(name));
	    Assert.assertTrue(asse);
	    CheckOut checkout =new CheckOut(dr);
	    checkout.india(); 
	    dr.findElement(By.xpath("//button[@routerlink='/dashboard/myorders']")).click();
		Assert.assertEquals(dr.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText(), "zara coat 3");
       
		dr.close();

	}

}
