package com.google.android.apps.iosched.ui;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.google.android.apps.iosched.ui.HomeActivity;

public class IPOGMM_2_WAYM28Test extends
		ActivityInstrumentationTestCase2<HomeActivity> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c9 
	 *
	 * 
	 */
	@Smoke 
	public void test_c15(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
			//driver.enterText(0, "9554");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c11 
	 *
	 * 
	 */
	@Smoke 
	public void test_c16(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
			//driver.enterText(0, "##%#$%");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGMM_2_WAYM28Test(){
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