package testclasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import pageclasses.LoginPage;

public class LoginTest extends BaseClass{
		LoginPage obj=new LoginPage();
		@Test(priority=0)
		public void excecuteLoginTest()
		{
			addimplicitwait();
			driver.findElement(By.xpath(obj.getUserName())).sendKeys("Admin");
			addimplicitwait();
			driver.findElement(By.xpath(obj.clikcContinue())).click();
			driver.findElement(By.xpath(obj.getPassword())).sendKeys("Admin123");
			driver.findElement(By.xpath(obj.clickSubmit())).click();

			
		}
}
