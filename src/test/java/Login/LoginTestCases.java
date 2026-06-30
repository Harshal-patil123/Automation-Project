package Login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.QAFoxLiveAutomationBaseClass;
import POMClasses.AccountRegisterPage;

@Listeners(Listener.ListenerClass.class)
public class LoginTestCases extends QAFoxLiveAutomationBaseClass
{
      @Test(priority = 1,dataProvider = "sender",dataProviderClass = DataProvider.LoginDataProvider.class)
      public void verifyLoginUsingValidCredentials(String emailId,String password)
      {
    	  registerpage.myAccount();
    	  
    	  accountloginpage.login();
    	  
    	  assertTrue(accountloginpage.loginPage(),"Not Navigated to Account login page");
    	  System.out.println("Navigated to Account login page");
    	  
    	  accountloginpage.email(emailId);
    	  accountloginpage.passWord(password);
    	  accountloginpage.loginButton();
    	  
    	  assertTrue(accountPage.accountPage(),"Login not successful");
    	  System.out.println("Login Successful");
    	  
    	  
      }
}
