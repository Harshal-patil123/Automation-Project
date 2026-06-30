package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage 
{
	
	public WebDriver driver=null;
	
    @FindBy(xpath="//a[text()='Success']")
    private WebElement accountcreated;
    
    @FindBy(css = ".btn.btn-primary")
    private WebElement continuebutton;
    
    public AccountSuccessPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public boolean accountCreated()
    {
    	return accountcreated.isDisplayed();
    }
    
    public void continueButton()
    {
    	continuebutton.click();
    }
    
}
