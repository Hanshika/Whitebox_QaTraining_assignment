package com.utils;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {
	
	public static String URI;
	public static String TWITTER_URI;
	public static String TOKEN;
	public static String TOKEN_SECRET;
	public static String CONSUMER_KEY;
	public static String CONSUMER_SECRET;
	public Configuration()
	{
		loadproperties();
	}

	public void loadproperties()
	{
		Properties prop = new Properties();

		try {
			FileReader reader = new FileReader(new File(String.format("%s/src/com/resources/config.properties",System.getProperty("user.dir"))));
			prop.load(reader);

			URI = prop.getProperty("uri");
			TWITTER_URI=prop.getProperty("twitter_uri");
			TOKEN = prop.getProperty("access_token");
			 TOKEN_SECRET = prop.getProperty("access_tokensecret");
			 CONSUMER_KEY = prop.getProperty("Consumer_Key");
			 CONSUMER_SECRET = prop.getProperty("Consumer_Secret");

		} catch (Exception ex) {

			System.out.println(ex);
		}

	}

}
