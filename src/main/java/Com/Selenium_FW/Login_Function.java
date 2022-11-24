package Com.Selenium_FW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Function {
	WebDriver dr;
	public Login_Function(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
    
	
	@FindBy(id="userEmail")
	WebElement mail;
	@FindBy(id="userPassword")
	WebElement pswd;
	@FindBy(id="login")
	WebElement submit; 
	
	public void ac(String userName,String pass)
	{
		mail.sendKeys(userName);
		pswd.sendKeys(pass);
		submit.click();
		
	}
	public void goTo()
	{
		dr.get("https://rahulshettyacademy.com/client");
	}
	
//	dr.findElement(By.id("userEmail")).sendKeys("dinga@gmail.com");
//	dr.findElement(By.id("userPassword")).sendKeys("Dinga@1438");
//	dr.findElement(By.id("login")).click();
	

}
