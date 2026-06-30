package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POMClasses.AccountLoginPage;
import POMClasses.AccountPage;
import POMClasses.AccountRegisterPage;
import POMClasses.AccountSuccessPage;
import UtilityMethods.PropertiesFile;

public class QAFoxLiveAutomationBaseClass 
{
	  public static WebDriver driver=null;
	  
	  protected AccountRegisterPage registerpage;
	  protected AccountSuccessPage accountsuccesspage;
	  protected AccountPage accountPage;
	  protected AccountLoginPage accountloginpage;
	  
      @BeforeMethod
      public void preCondition() throws IOException
      {
    	  String browser=PropertiesFile.readProperty("browser");
    	  String url=PropertiesFile.readProperty("url");
    	  
    	  if(browser.equals("chrome"))
    	  {
    		  driver=new ChromeDriver();
    	  }
     	  else if(browser.equals("edge"))
     	  {
     		 driver=new EdgeDriver();
     	  }
     	  else if(browser.equals("firefox"))
     	  {
     		 driver=new FirefoxDriver();
     	  }
     	  else 
     	  {
     		 driver=new InternetExplorerDriver();
     	  }
    	  
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 driver.get(url);
    	 
    	 registerpage=new AccountRegisterPage(driver);
         accountsuccesspage=new AccountSuccessPage(driver);
         accountPage=new AccountPage(driver);
         accountloginpage=new AccountLoginPage(driver);
      }
      
      @AfterMethod
      public void postCondition()
      {
    	  if(driver != null)
    	  {
    	      driver.quit();
    	  }
    	  /*Hii*/
      }
}
