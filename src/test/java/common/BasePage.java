package common;

import pages.fitpeo.HomePageFP;
import pages.fitpeo.RevenueCalculator;

public class BasePage extends BaseClass{

	public static HomePageFP objpeoHomePage;
	public static RevenueCalculator objRevenueCalculator;
	
	
	
	public static void PageObectInitialization() {
		
		objpeoHomePage=new HomePageFP(driver);
		objRevenueCalculator= new RevenueCalculator(driver);	
		
	}

	public static void destroyPageObjects() {
		objpeoHomePage=null;
		objRevenueCalculator=null;
	}

}
