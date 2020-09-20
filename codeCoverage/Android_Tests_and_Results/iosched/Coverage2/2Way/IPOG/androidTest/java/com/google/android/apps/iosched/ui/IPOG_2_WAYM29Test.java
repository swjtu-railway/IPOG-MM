package com.google.android.apps.iosched.ui;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.google.android.apps.iosched.ui.HomeActivity;

public class IPOG_2_WAYM29Test extends
		ActivityInstrumentationTestCase2<HomeActivity> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c9 
	 *
	 * 
	 */
	@Smoke 
	public void test_c27(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(0);


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
	public void test_c28(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(1);


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
	public void test_c29(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(2);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c15 
	 *
	 * 
	 */
	@Smoke 
	public void test_c30(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(3);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c17 
	 *
	 * 
	 */
	@Smoke 
	public void test_c31(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(4);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c19 
	 *
	 * 
	 */
	@Smoke 
	public void test_c32(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(5);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c21 
	 *
	 * 
	 */
	@Smoke 
	public void test_c33(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(6);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c23 
	 *
	 * 
	 */
	@Smoke 
	public void test_c34(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(440, 70);
//			driver.clickInList(7);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOG_2_WAYM29Test(){
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