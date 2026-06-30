package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegisterPage 
{
	public static WebDriver driver=null;
	
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myaccount;
    
    @FindBy(xpath = "//a[text()='Register']")
    private WebElement register;
    
    @FindBy(id = "input-firstname")
    private WebElement firstname;
    
    @FindBy(id = "input-lastname")
    private WebElement lastname;
    
    @FindBy(id="input-email")
    private WebElement email;
    
    @FindBy(id = "input-telephone")
    private WebElement telephone;
    
    @FindBy(name = "password")
    private WebElement password;
    
    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmpassword;
    
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement privacypolicy;
    
    @FindBy(css = ".btn.btn-primary")
    private WebElement continuebutton;
    
    public AccountRegisterPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void myAccount()
    {
    	myaccount.click();
    }
    
    public void register()
    {
    	register.click();
    }
    
    public void firstName(String name)
    {
    	firstname.sendKeys(name);
    }
    
    public void lastName(String name)
    {
    	lastname.sendKeys(name);
    }
    
    public void email(String emailid)
    {
    	email.sendKeys(emailid);
    }
    
    public void telePhone(String telephoneno)
    {
    	telephone.sendKeys(telephoneno);
    }
    
    public void passWord(String passwordid)
    {
    	password.sendKeys(passwordid);
    }
    
    public void confirmPassWord(String passwordid)
    {
    	confirmpassword.sendKeys(passwordid);
    }
    
    public void privacyPolicy()
    {
    	privacypolicy.click();
    }
    
    public void continueButton()
    {
    	continuebutton.click();
    }
}
