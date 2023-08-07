package aarongAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS6_searchProduct extends setup{
	@Test
	public void searchProduct()
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
	}
}
