package com.google.android.apps.iosched.ui;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.google.android.apps.iosched.ui.HomeActivity;

public class IPOGPO_2_WAYM30Test extends
		ActivityInstrumentationTestCase2<HomeActivity> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c8 
	 *
	 * 
	 */
	@Smoke 
	public void test_c19(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(0);
			driver.clickOnScreen(440, 70);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c10 
	 *
	 * 
	 */
	@Smoke 
	public void test_c20(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(1);
			driver.clickOnScreen(440, 70);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c12 
	 *
	 * 
	 */
	@Smoke 
	public void test_c21(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(2);
			driver.clickOnScreen(440, 70);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c14 
	 *
	 * 
	 */
	@Smoke 
	public void test_c22(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(3);
			driver.clickOnScreen(440, 70);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGPO_2_WAYM30Test(){
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