package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import constantData.ConstantsData;

public class BaseClass {
	 
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		String browserName=FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
		}
	
	}
	public static void addimplicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void addExplicitWait(By locator)
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void takeScreenshot() throws IOException 
	{
		if (driver != null) {
	
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(ConstantsData.ScreenshotPath);
		FileUtils.copyFile(srcfile,destFile);
		}
		else {
			System.out.println("cannot take screenshot");
		}
	}
	public static void scrollDown() 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
	}
}
