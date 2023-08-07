package aarongAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS5_login extends setup{
	@Test
	public void login()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnLoginNow")).click();
        driver.findElement(By.id("etUsername")).sendKeys("01812345123");
        driver.findElement(By.id("btnLogin")).click();
		
	}
}
