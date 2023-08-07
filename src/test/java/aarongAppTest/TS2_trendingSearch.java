package aarongAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS2_trendingSearch extends setup{
	@Test
	public void trendingSearch()
	{
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("tvNext")).click();
		driver.findElement(By.id("btnStartShopping")).click();
		driver.findElement(By.id("searchFragment")).click();
		driver.findElement(By.id("tvTrendingOne")).click();
	}

}
