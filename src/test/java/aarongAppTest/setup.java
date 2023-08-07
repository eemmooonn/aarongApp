package aarongAppTest;

import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class setup {
	AndroidDriver driver;
	
	@BeforeClass
	public void setupDriver() 
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel_6_Pro");
		options.setApp("C:\\Users\\EmOn-Local\\Desktop\\code-workspace\\aarongApp\\src\\test\\java\\targetApp\\Aarong.apk");
		options.setCapability("noReset", false);
		options.setCapability("autoGrantPermissions", "true");
		
		driver = new AndroidDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


	@AfterClass
	public void teraDown() throws InterruptedException
	{
		Thread.sleep(10000);
        driver.quit();	
	}
	
}
