package com.mohs10.scripts;


import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

public class HomeTest extends StartBrowser {

	
	  String excelfile = "C:\\Users\\DELL\\demo\\TestData\\Data.xlsx";
	  String excelsheet = "Login"; 
	 
      //WebDriver driver;

	@Test
	public void LoginTestCase() throws Exception {

		CommonFuns hm2 = new CommonFuns();

		
		  int rowcount = XLUtils.getRowCount(excelfile, excelsheet); for (int i = 1; i
		  < rowcount; i++) { String Email = XLUtils.getStringCellData(excelfile,
		  excelsheet, i, 0); String Pwd = XLUtils.getStringCellData(excelfile,
		  excelsheet, i, 1);}
		 
		hm2.datePicker( "https://www.orangehrm.com/contact-sales/","" ,"Anguilla"); 

		SSreuseclass.SSReusablemethod(driver,"login");
		Thread.sleep(5000);

		
		// hm2.logout();
	}
	





}
