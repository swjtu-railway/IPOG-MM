package com.google.android.apps.iosched.ui;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.google.android.apps.iosched.ui.HomeActivity;

public class IPOGPO_2_WAYM41Test extends
		ActivityInstrumentationTestCase2<HomeActivity> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c24 c8 
	 *
	 * 
	 */
	@Smoke 
	public void test_c29(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(0);
			driver.clickInList(3);
			driver.goBack();


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c24 c10 
	 *
	 * 
	 */
	@Smoke 
	public void test_c30(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(1);
			driver.clickInList(3);
			driver.goBack();


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c24 c12 
	 *
	 * 
	 */
	@Smoke 
	public void test_c31(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(2);
			driver.clickInList(3);
			driver.goBack();


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c18 c14 
	 *
	 * 
	 */
	@Smoke 
	public void test_c32(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(3);
			driver.clickInList(0);
			driver.goBack();


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c20 c14 
	 *
	 * 
	 */
	@Smoke 
	public void test_c33(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(3);
			driver.clickInList(1);
			driver.goBack();


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c22 c14 
	 *
	 * 
	 */
	@Smoke 
	public void test_c34(){
		try {
			// Trigger web events
			driver.clickOnButton("Sessions");
			driver.clickInList(3);
			driver.clickInList(2);
			driver.goBack();


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGPO_2_WAYM41Test(){
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