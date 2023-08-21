package aarongAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS7_changeLocation extends setup{
	
	@Test
	public void changeLocation()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnStartShopping")).click();
		driver.findElement(By.id("moreFragment")).click();
		driver.findElement(By.id("tvChangeLocation")).click();
		driver.findElement(By.id("etCountry")).click();
		driver.findElement(By.id("tvSelectDeliveryLocation")).click();
		driver.findElement(By.id("btnGo")).click();
		
	}
	
}
