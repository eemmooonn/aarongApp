package aarongAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS3_chooseBrand extends setup{
	
	@Test
	public void chooseBrand()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnStartShopping")).click();
		driver.findElement(By.id("homeFragment")).click();
		driver.findElement(By.id("llTaagaMan")).click();
	}
}
