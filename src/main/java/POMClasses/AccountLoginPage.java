package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage 
{
	public WebDriver driver=null;
	
    @FindBy(xpath = "//a[text()='Login']")
    private WebElement login;
    
    @FindBy(id = "input-email")
    private WebElement email;
    
    @FindBy(id = "input-password")
    private WebElement password;
    
    @FindBy(xpath = "//input[contains(@class,'btn btn-primary')]")
    private WebElement loginbutton;
    
    @FindBy(xpath = "(//a[text()='Login'])[2]")
    private WebElement loginpage;
    
    public AccountLoginPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void login()
    {
    	login.click();
    }
    
    public void email(String emailid)
    {
    	email.sendKeys(emailid);
    }
    
    public void passWord(String passwd)
    {
    	password.sendKeys(passwd);
    }
    
    public void loginButton()
    {
    	loginbutton.click();
    }
    
    public boolean loginPage()
    {
    	return loginpage.isDisplayed();
    }
    
}
