package cucumbermap;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class Login {
	public static WebDriver driver=null;
	
	
	@When ("^user open \"(.*)\" brower with exe as \"(.*)\"$")
	public static void OpenBrowser(String bname ,String exe) {
		 Object[] input=new Object[2];
	    	input[0]=bname;
		    input[1]=exe;
	        SeleniumOperations.browserLaunch(input);
	}
	
	
	@When ("^user enter url as \"(.*)\"$")
	public static void open_url(String url1){
	       Object[] input1=new Object[1];
	       input1[0]=url1;
        SeleniumOperations.openApplication(input1);
        }
	
	@When ("^user successfully move mouse cursor on Login button$")
	public static void mouse_hover(){
        Object[] input2=new Object[1];
        input2[0]="//*[@class='nav-line-2 ']";
        Hashtable<String,Object> output2=SeleniumOperations.navigate(input2);
        HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user successfully move mouse cursor on Login button$", output2.get("MESSAGE").toString());
    
        }
	
	@When ("^user successfully click on profile tab under Login$")
	public static void click_profile(){
		   Object[] input3=new Object[1];
           input3[0]="//*[@class='nav-line-2 ']";
           Hashtable<String,Object> output3= SeleniumOperations.clickOnElement(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user successfully click on profile tab under Login$",output3.get("MESSAGE").toString());
	}
	
	@When ("^user successfully enter \"(.*)\" as userid$")
	public static void enter_uesrid(String userid){
		   Object[] input4 = new Object[2];
					input4[0]="//*[@id='ap_email']";
					input4[1]=userid;
					Hashtable<String,Object>  output4= SeleniumOperations.sendkey(input4);
					HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user successfully enter \"(.*)\" as userid$",output4.get("MESSAGE").toString() );
			}
	
	@When ("^user click on continue$")
	public static void click_continue(){
		  Object[] input5 = new Object[1];
			input5[0]="(//*[@id='continue'])[1]";
			Hashtable<String,Object> output5=SeleniumOperations.clickOnElement(input5);
			HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on continue$", output5.get("MESSAGE").toString() );
		}
	
	@When ("^user successfully enter \"(.*)\" as password$")
	public static void enter_password(String password){
		Object[] input6 = new Object[2];
		input6[0]="//*[@id='ap_password']";
		input6[1]=password;
		Hashtable<String,Object> output6= SeleniumOperations.sendkey(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user successfully enter \"(.*)\" as password$", output6.get("MESSAGE").toString() );
	}

	@When ("^user click on Login$")
	public static void click_login(){
			Object[] input7 = new Object[1];
		input7[0]="//*[@id='signInSubmit']";
		Hashtable<String,Object> output7=SeleniumOperations.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login$", output7.get("MESSAGE").toString() );
	}
	
	@Then ("^user succefully logged in with valid credentials$")
	public static void login_validation(){
		Object[] input8=new Object[2];
		input8[0]="Hello, harshal";
		input8[1]="//*[@id='nav-link-accountList-nav-line-1']";
		Hashtable<String,Object> output8=SeleniumOperations.validationForLogin(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user succefully logged in with valid credentials$", output8.get("MESSAGE").toString() );
	
	}
		
	
}
	
