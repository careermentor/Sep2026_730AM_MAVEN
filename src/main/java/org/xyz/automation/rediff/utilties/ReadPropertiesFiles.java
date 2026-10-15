package org.xyz.automation.rediff.utilties;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFiles 
{

	
	public static String read_config_data(String key) throws Exception
	{
		
		FileReader fr = new FileReader("./configdata/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
	public static String read_element_data(String key) throws Exception
	{
		
		FileReader fr = new FileReader("./configdata/element.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
}
