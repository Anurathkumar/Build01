package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData 
{
	public static String readpropertyFile(String value) throws IOException
	{
	Properties prop=new Properties();
	FileInputStream file=new FileInputStream("E:\\Testing Course\\eclipse java\\Selenium_Framework\\TestData\\config.properties");
	prop.load(file);
	return prop.getProperty(value);
	}

}
