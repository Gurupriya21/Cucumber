package com.Properties.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws IOException
	{
	File f = new File("");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
		
	}

	public String get_config_url()
	{
		String url = p.getProperty("url");
		return url;
	}
	
	public String getemail()
	{
		String email = p.getProperty("email");
		return email;
	}
	
	public String getpassword()
	{
		String password = p.getProperty("email");
		return password;
	}
	
	
	
}
