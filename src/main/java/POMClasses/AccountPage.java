package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage 
{
   public WebDriver driver=null;	
	
   @FindBy(xpath ="//a[text()='Account']")
   private WebElement accountpage;
   
   public AccountPage(WebDriver driver)
   {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
   }
   
   public boolean accountPage()
   {
	   return accountpage.isDisplayed();
   }
}
