package gov.uspto.opsg.pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Base {
public static WebDriver driver;	
public static Properties prop;
	

public Base()  {
	prop=new Properties();
FileInputStream file;
try {
	file = new FileInputStream("config.properties");
	try {
		prop.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
		
public static WebDriver inilitizeBrowser() {
	String browser=prop.getProperty("browser");
	if ((browser.equalsIgnoreCase("chrome")||browser.equalsIgnoreCase("ch"))) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		 driver = new ChromeDriver();

	}else if((browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("ff"))) {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
		 driver = new FirefoxDriver();
		
	}else if((browser.equalsIgnoreCase("internet Explorer")||browser.equalsIgnoreCase("ie"))) {
		
		System.setProperty("webdriver.ie.driver", "src/test/resources/Drivers/IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		 
	}else if((browser.equalsIgnoreCase("safari")||browser.equalsIgnoreCase("sf"))) {
		
		 driver = new SafariDriver();
		 
	}
	else 
	{System.out.println("No other browser exist");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
return driver;

}
	
}