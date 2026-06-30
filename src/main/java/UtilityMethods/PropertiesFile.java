package UtilityMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile 
{
   public static String readProperty(String key) throws IOException
   {
		Properties prop=new Properties();
		File path=new File(".\\src\\test\\resources\\configuration.properties");
	  	FileInputStream fis=new FileInputStream(path);
	  	prop.load(fis);
	  	String data=prop.getProperty(key);
	  	return data;
   }
}
