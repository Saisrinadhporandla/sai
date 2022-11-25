package amazon;

import org.openqa.selenium.WebDriver;

public class Landing_WebPage {
	WebDriver dr;
	public  Landing_WebPage(WebDriver dr)
	{
		this.dr=dr;
	}
	public void url()
	{
		dr.get("https://www.amazon.com/");
	}
	
}
