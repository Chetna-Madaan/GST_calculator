package com.gst.calculate;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadPropertyFile {
	public String getProperty(String propertyName) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\hp\\Desktop\\workspace\\GSTCalculator\\GST_Calculator\\src\\com\\gst\\config\\config.properties");
			prop.load(fileInputStream);
			return prop.getProperty(prop.getProperty(propertyName));

		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			fileInputStream.close();
		}
		return "";
	}
}



