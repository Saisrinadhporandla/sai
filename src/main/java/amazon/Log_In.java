package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_In {
	WebDriver dr;
	public Log_In(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
@FindBy(id="nav-link-accountList-nav-line-1")
WebElement click1;
@FindBy(xpath="//input[@id='ap_email']")
WebElement user;
@FindBy(css="input#continue")
WebElement click2;
@FindBy(id="ap_password")
WebElement pswd;
@FindBy(id="signInSubmit")
WebElement click3;
public void log_In()
{
	click1.click();
	user.sendKeys("9704219395");
	click2.click();
	pswd.sendKeys("Srin@dh2448");
	click3.click();
}
	

}
//dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
//
////valid Mobile Number
//dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
//
//dr.findElement(By.cssSelector("input#continue")).click();
//// Valid Password
//dr.findElement(By.id("ap_password")).sendKeys("Srin@dh2448");
//dr.findElement(By.id("signInSubmit")).click();
