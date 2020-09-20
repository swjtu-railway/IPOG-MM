package com.google.android.apps.iosched.ui;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.google.android.apps.iosched.ui.HomeActivity;

public class IPOG_2_WAYM91Test extends
		ActivityInstrumentationTestCase2<HomeActivity> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c11 
	 *
	 * 
	 */
	@Smoke 
	public void test_c17(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(370, 70);
			driver.scrollToSide(0);
			driver.clickOnScreen(36, 140);
			driver.clickOnButton(0);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c13 
	 *
	 * 
	 */
	@Smoke 
	public void test_c18(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(370, 70);
			driver.scrollToSide(0);
			driver.clickOnScreen(36, 140);
			driver.clickOnButton(1);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOG_2_WAYM91Test(){
		super("com.google.android.apps.iosched.ui", HomeActivity.class);
	}

	@Override
	public void setUp() throws Exception {
		driver = new Solo(getInstrumentation(), getActivity());
	}


	@Override
	public void tearDown() throws Exception {
		// Robotium will finish all the activities that have been opened
		driver.finishOpenedActivities();
	}
}