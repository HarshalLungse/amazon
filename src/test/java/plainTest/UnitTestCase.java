/*package plainTest;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\automation support\\project workspace\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
		driver.get("https://www.flipkart.com"); 
		//cancle login window 
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		//mouse hover on Login button 
		Actions actions=new Actions(driver);
        WebElement abc=driver.findElementByXPath("//*[@class='_1_3w1N']");
        actions.moveToElement(abc).build().perform();	
       //click on profile under Login section 
        //(//*[@Class='_3vhnxf'])[1]
       // driver.findElementByXPath("(//*[@Class='_3vhnxf'])[1]").click();
        driver.findElementByXPath("(//*[@Class='_2kxeIr _1pY_1Z'])[1]").click();
        //enter user name 
        driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("8446339632");
        //enter click on request otp button 
      driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
      
      
      
      
    
      // Find the element that requires the "press and hold" verification
      WebElement abc = driver.find_element_by_xpath("//xpath/to/element")

      // Use ActionChains to simulate pressing and holding down the mouse button on the element
      action_chains = ActionChains(driver)
      action_chains.move_to_element(abc).click_and_hold().perform()

      // Sleep for a few seconds to give the user time to complete the verification
      time.sleep(10)

      //Release the mouse button to complete the verification
      action_chains.release().build().perform()

        
	}
	//incomplete code day 36
}
*/



package plainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\automation support\\project workspace\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.flipkart.com"); 
        //cancel login window 
        driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
        //mouse hover on Login button 
        Actions actions=new Actions(driver);
        WebElement abc=driver.findElementByXPath("//*[@class='_1_3w1N']");
        actions.moveToElement(abc).build().perform();    
        //click on profile under Login section 
        // (//*[@Class='_3vhnxf'])[1]
        driver.findElementByXPath("(//*[@Class='_3vhnxf'])[1]").click();
        //enter user name 
        WebElement userName = driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']");
        userName.sendKeys("8446339632");
        //click on request otp button 
        WebElement requestOtpButton = driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']");
        requestOtpButton.click();
        //change focus to frame 
         driver.switchTo().frame(driver.findElementByXPath("//*[@id='XYBkaNzHGwSehkx']"));
       
        // Handle "press and hold key... verify you are human" challenge
      WebElement pressAndHoldKey = driver.findElementByXPath("//*[@id='XYBkaNzHGwSehkx']");
         
        
        if(pressAndHoldKey.isDisplayed()) {
            Actions pressAndHold = new Actions(driver);
            pressAndHold.clickAndHold(pressAndHoldKey).build().perform(); 
            pressAndHold.sendKeys(Keys.ARROW_RIGHT).build().perform(); 
            pressAndHold.sendKeys(Keys.ARROW_LEFT).build().perform(); 
            pressAndHold.sendKeys(Keys.ARROW_UP).build().perform(); 
            pressAndHold.sendKeys(Keys.ARROW_DOWN).build().perform(); 
          //  pressAndHold.release(pressAndHoldKey).build().perform(); 
           
        }
    }
}/*   7276009632
      8605009632
      8446339632
      7020360878
      *
      *
      */
      
      
      
