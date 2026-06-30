package UtilityMethods;

import java.util.Date;

public class generateRandomEmail 
{
   
   public static String generateRandomEmail()
   {
	    
	   Date date=new Date();
	   String date1=date.toString().replaceAll("\\s","");// \\s is works like " "
	   String date2=date1.replaceAll("\\:","");          // \\: is works like ":"
	   
	   return date2+"@gmail.com";
   }
}
