package aarongAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS1_signUp extends setup{
	@Test
	public void signUp()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnSignUp")).click();
		driver.findElement(By.id("etFirstName")).sendKeys("Test1220");
		driver.findElement(By.id("etLastName")).sendKeys("Automation");
		driver.findElement(By.id("etMobileNumber")).sendKeys("01432345123");
		driver.findElement(By.id("etGender")).click();
		driver.findElement(By.id("tvRegister")).click();
		driver.findElement(By.id("btnContinue")).click();
		driver.findElement(By.id("etEmail")).sendKeys("test1720@gmail.com");
		driver.findElement(By.id("etDob")).sendKeys("01/01/2000");
		driver.findElement(By.id("etPassword")).sendKeys("1234ABCD");
		driver.findElement(By.id("etConfirmPassword")).sendKeys("1234ABCD");
		driver.findElement(By.id("cbSubscribe")).click();
		driver.findElement(By.id("btnRegister")).click();
		
		//boolean otppage = driver.findElement(By.id("etOtp")).isDisplayed();
		//Assert.assertEquals(otppage, true);
		
	}
}
