package basepac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Amazonbase {
	public static Properties pr=new Properties();
	public static WebDriver driver;
	
	public Amazonbase() {
		try {
			FileInputStream file=new FileInputStream("C:\\Users\\Jatinder\\eclipse-workspace\\AmazonFramework\\src\\test\\java\\envionmentvariabless\\Configu.properties");
			pr.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}}
    public static void start() {
    	String browsername=pr.getProperty("browser");
    	if(browsername.equals("Firefox")) {
    		System.setProperty("Webdriver.gecko.driver", "geckodriver.exe");
    		driver=new FirefoxDriver();
    	}
    	else if(browsername.equals("chrome")) {
    		System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.get(pr.getProperty("url"));
    }
}
