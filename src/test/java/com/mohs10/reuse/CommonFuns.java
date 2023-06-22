package com.mohs10.reuse;
	
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns extends Action {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
			  
				
              
			 
		public void datePicker(String url,String value1,String value2) throws Exception {
			StartBrowser.childTest=StartBrowser.parentTest.createNode("login");
			aDriver.navigateToApplication(url);
			
			
		}
	}
			  
			  
			  
	
	
			  
			  
			  
			  
			  
			 