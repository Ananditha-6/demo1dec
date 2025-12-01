package testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.ListenersImplementation;
import pageclasses.RegisterPatient;

@Listeners(ListenersImplementation.class)

public class RegisterPatientTest extends BaseClass{

	LoginTest obj1=new LoginTest();
	RegisterPatient rpobj=new RegisterPatient();

	@DataProvider(name="MyDP1")
	public Object[][] method()
	{
		return new Object [][] {{"Harry","Dsouza","32","hyderabad"}
			//,{"Henry","Williams","45","banglore"}
			};
	}
	
	@Test (dataProvider="MyDP1")
	public void addPatient(String fn,String ln,String age1,String add) 
	{
		addimplicitwait();
		obj1.excecuteLoginTest();
		addExplicitWait(By.xpath(rpobj.addPatientButton()));
		driver.findElement(By.xpath(rpobj.addPatientButton())).click();
		driver.findElement(By.xpath(rpobj.patientIdentity())).click();
		driver.findElement(By.xpath(rpobj.firstname())).sendKeys(fn);
		driver.findElement(By.xpath(rpobj.lastname())).sendKeys(ln);
		//scrollDown();
		//addExplicitWait(By.xpath(rpobj.gender()));
		driver.findElement(By.xpath(rpobj.gender())).click();
		driver.findElement(By.xpath(rpobj.DObButton())).click();
		driver.findElement(By.xpath(rpobj.age())).sendKeys(age1);
		driver.findElement(By.xpath(rpobj.adress())).sendKeys(add);
		driver.findElement(By.xpath(rpobj.registerbtn())).click();
		
		WebElement patID=driver.findElement(By.xpath(rpobj.validatepatid()));
		
		driver.findElement(By.xpath(rpobj.closepg())).click();
		if(patID.isDisplayed()==true)
		{
			System.out.println("Test passed");
		}
		else
		{
			throw new NullPointerException("patient registration failed");
		}
	}
	
	
	
	
	}
