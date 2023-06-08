package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.cli.Main;
import okio.Timeout;

public class SeleniumOperations {
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try
		{
		String browser=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", exe);
			driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
			 }else if(browser.equalsIgnoreCase("firefox")){
                 System.setProperty("webdriver.gecko.driver", exe);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			}
		outputParameters.put("STATUS", "PASS") ;
		outputParameters.put("MESSAGE", "MethodUsed: browserLaunch , InputData:  "+inputParameters[1].toString()) ;
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL") ;
			outputParameters.put("MESSAGE", "MethodUsed: browserLaunch , InputData:  "+inputParameters[1].toString()) ;
		}
		return outputParameters; 
	}
public static Hashtable<String,Object> openApplication(Object[]inputParameters) 
{
	try
	{
	String url=(String) inputParameters[0];
	driver.get(url);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 outputParameters.put("STATUS", "PASS") ;
		outputParameters.put("MESSAGE", "MethodUsed: openApplication , InputData:  "+inputParameters[0].toString()) ;
}
	catch(Exception e)
{

		outputParameters.put("STATUS", "FAIL") ;
		outputParameters.put("MESSAGE", "MethodUsed: openApplication , InputData:  "+inputParameters[0].toString()) ;
}
	return outputParameters; 
}	


public static Hashtable<String,Object> navigate(Object[]inputParameters) 
{
	try
	{
	String abc=(String) inputParameters[0];
WebElement login=driver.findElement(By.xpath(abc));
Actions actions=new Actions(driver);
actions.moveToElement(login).build().perform();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
outputParameters.put("STATUS", "PASS") ;
outputParameters.put("MESSAGE", "MethodUsed: navigate , InputData:  "+inputParameters[0].toString()) ;
	}catch(Exception e)
	{

		outputParameters.put("STATUS", "FAIL") ;
		outputParameters.put("MESSAGE", "MethodUsed: navigate , InputData:  "+inputParameters[0].toString()) ;
	}
	return outputParameters; 
}

public static Hashtable<String,Object> clickOnElement(Object[]inputParameters) 
{
	try
	{
String xpath=(String) inputParameters[0];
WebElement abc1=driver.findElement(By.xpath(xpath));
abc1.click();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
outputParameters.put("STATUS", "PASS") ;
outputParameters.put("MESSAGE", "MethodUsed: clickOnElement , InputData:  "+inputParameters[0].toString()) ;
	}catch(Exception e)
	{

		outputParameters.put("STATUS", "FAIL") ;
		outputParameters.put("MESSAGE", "MethodUsed: clickOnElement , InputData:  "+inputParameters[0].toString()) ;
	}
	return outputParameters; 
}
 public static Hashtable<String,Object> sendkey(Object[]inputParameters)
 {
	 try
	 {
	 String xpath2=(String)inputParameters[0];
	 WebElement emailid=driver.findElement(By.xpath(xpath2));
	 String userid=(String) inputParameters[1];
	 emailid.sendKeys(userid);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 outputParameters.put("STATUS", "PASS") ;
		outputParameters.put("MESSAGE", "MethodUsed: sendkey , InputData:  "+inputParameters[0].toString()) ;
		}catch(Exception e)
		{

			outputParameters.put("STATUS", "FAIL") ;
			outputParameters.put("MESSAGE", "MethodUsed: sendkey , InputData:  "+inputParameters[0].toString()) ;
		}
	 return outputParameters; 
}
 
 
 
 public static Hashtable<String,Object> validationForLogin(Object[]inputParameters)
 {   
	 try
	 {
	 String givenText=(String) inputParameters[0];
	 String xpath=(String) inputParameters[1];
	 String actualText=driver.findElement(By.xpath(xpath)).getText();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 if(givenText.equalsIgnoreCase(actualText))
	 {
		 System.out.println("Test Case Passed");
		 
	 }else
	 {
		 
		 System.out.println("Test Case Failed");
		  
	 }
	 outputParameters.put("STATUS", "PASS") ;
		outputParameters.put("MESSAGE", "MethodUsed: validationForLogin , InputData:  "+inputParameters[1].toString()) ;
	 
	 }catch(Exception e)
		{

			outputParameters.put("STATUS", "FAIL") ;
			outputParameters.put("MESSAGE", "MethodUsed: validationForLogin , InputData:  "+inputParameters[1].toString()) ;
		}
	 return outputParameters; 
	 
 }
 
 
 
 
 
 
 
}
