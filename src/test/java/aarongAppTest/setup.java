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
	
	/* 
	@Test
	public void TS1_signUp()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnSignUp")).click();
		driver.findElement(By.id("etFirstName")).sendKeys("TestX");
		driver.findElement(By.id("etLastName")).sendKeys("Automation");
		driver.findElement(By.id("etMobileNumber")).sendKeys("01732345123");
		driver.findElement(By.id("etGender")).click();
		driver.findElement(By.id("tvRegister")).click();
		driver.findElement(By.id("btnContinue")).click();
		driver.findElement(By.id("etEmail")).sendKeys("test00x@gmail.com");
		driver.findElement(By.id("etDob")).sendKeys("01/01/2000");
		driver.findElement(By.id("etPassword")).sendKeys("1234ABCD");
		driver.findElement(By.id("etConfirmPassword")).sendKeys("1234ABCD");
		driver.findElement(By.id("cbSubscribe")).click();
		driver.findElement(By.id("btnRegister")).click();
		
		boolean otppage = driver.findElement(By.id("etOtp")).isDisplayed();
		
		Assert.assertEquals(otppage, true);
		
	}
	*/
	/* 
	@Test
	public void TS2_trendingSearch()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnStartShopping")).click();
		driver.findElement(By.id("searchFragment")).click();
		driver.findElement(By.id("tvTrendingOne")).click();
	}
	*/
	/* 
	@Test
	public void TS3_chooseBrand()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnStartShopping")).click();
		driver.findElement(By.id("homeFragment")).click();
		driver.findElement(By.id("llTaagaMan")).click();
	}
	*/
	/* 
	@Test
	public void TS4_findstore() throws InterruptedException
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnStartShopping")).click();
		driver.findElement(By.id("moreFragment")).click();
        driver.findElement(By.id("tvFindStore")).click();
        Thread.sleep(10000);
        driver.findElements(By.className("android.view.View")).get(0).click();
        driver.findElements(By.className("android.widget.CheckedTextView")).get(6).click();
		
	}
	*/
	/* 
	@Test
	public void TS5_login()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnLoginNow")).click();
        driver.findElement(By.id("etUsername")).sendKeys("01812345123");
        driver.findElement(By.id("btnLogin")).click();
		
	}
	*/
	/*
	@Test
	public void TS6_searchProduct()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnStartShopping")).click();
		driver.findElement(By.id("searchFragment")).click();
		
		driver.findElement(By.id("etSearch")).sendKeys("panjabi");
		
		//driver.findElement(By.className("android.widget.AutoCompleteTextView")).sendKeys("panjabi");
		//driver.findElement(By.id("etSearch")).sendKeys("\n");
		
		//WebElement search_box = driver.findElement(By.id("etSearch"));
		//search_box.sendKeys("panjabi");
		//search_box.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("etSearch")).sendKeys(Keys.ENTER);
		//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}*/

	@AfterClass
	public void teraDown() throws InterruptedException
	{
		Thread.sleep(10000);
        driver.quit();	
	}
	
}
