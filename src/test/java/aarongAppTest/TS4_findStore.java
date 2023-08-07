package aarongAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS4_findStore extends setup{
	
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

}
