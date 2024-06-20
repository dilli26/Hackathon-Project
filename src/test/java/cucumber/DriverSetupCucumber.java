package cucumber;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverSetupCucumber {
	
	WebDriver driver;
	
	@Before
	public void driverSetup() {
		Scanner sc = new Scanner(System.in);
		String browserName = "chrome";//sc.next();
//		DriverInstance di = new DriverInstance();
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}else {
			System.out.println("Invalid Browser");
		}
		String url="";
		try {
			FileReader file = new FileReader("./src/test/resources/Properties.properties");
			Properties p = new Properties();
			p.load(file);
			url = p.getProperty("url");
    	} catch (IOException e) {

    	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DriverInstance.driver=driver;
	}
	
	@After
	public void driverClose() {
		driver.quit();
	}
}
