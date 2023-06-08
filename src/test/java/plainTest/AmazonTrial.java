package plainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTrial {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", "F:\\automation support\\project workspace\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        driver.get("https://www.amazon.in"); 
	       Actions actions=new Actions(driver);
	        WebElement abc=driver.findElementByXPath("//*[@class='nav-line-2 ']");
	        actions.moveToElement(abc).build().perform();    
	        //click on profile under Login section 
	        driver.findElementByXPath("//*[@class='nav-line-2 ']").click();
	        driver.findElementByXPath(" //*[@id='ap_email']").sendKeys("harshallungse@gmail.com");
	        driver.findElementByXPath("(//*[@id='continue'])[1]").click();
	        driver.findElementByXPath("//*[@id='ap_password']").sendKeys("azazsxsx..");
	        driver.findElementByXPath("//*[@id='signInSubmit']").click();
	     
	      //*[@id='ap_password']
	        
	}

}
