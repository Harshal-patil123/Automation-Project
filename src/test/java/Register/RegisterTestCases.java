package Register;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.QAFoxLiveAutomationBaseClass;
import UtilityMethods.PropertiesFile;
import UtilityMethods.generateRandomEmail;

@Listeners(Listener.ListenerClass.class)
public class RegisterTestCases extends QAFoxLiveAutomationBaseClass
{
	 
      @Test(priority = 1,dataProvider = "sender",dataProviderClass = DataProvider.RegisterDataProvider.class)
      public void verifyingRegisteringAccountByMandatoryFields(String firstname,String lastname,String telephone,String password,String confirmpassword) throws IOException
      {
    	  registerpage.myAccount();
    	  registerpage.register();
    	  registerpage.firstName(firstname);
    	  registerpage.lastName(lastname);
    	  registerpage.email(generateRandomEmail.generateRandomEmail());
    	  registerpage.telePhone(telephone);
    	  registerpage.passWord(password);
    	  registerpage.confirmPassWord(confirmpassword);
    	  registerpage.privacyPolicy();
    	  registerpage.continueButton();
    	  
    	  assertTrue(accountsuccesspage.accountCreated(),"Account not created Successfully");
    	  System.out.println("Account created Successfully");
    	  
          assertTrue(accountPage.accountPage(),"Not Navigated to Account Page");
          System.out.println("Navigated to Account page");
    	  
    	  
      }
}
