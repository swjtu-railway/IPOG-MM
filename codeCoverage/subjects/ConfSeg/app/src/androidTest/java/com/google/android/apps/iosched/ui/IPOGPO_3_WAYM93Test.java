package com.google.android.apps.iosched.ui;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.google.android.apps.iosched.ui.HomeActivity;

public class IPOGPO_3_WAYM93Test extends
		ActivityInstrumentationTestCase2<HomeActivity> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c13 
	 *
	 * 
	 */
	@Smoke 
	public void test_c17(){
		try {
			// Trigger web events
			driver.clickOnButton("Schedule");
			driver.clickOnScreen(370, 70);
			driver.scrollToSide(1);
			driver.scrollDown();
			driver.clickOnButton(1);


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGPO_3_WAYM93Test(){
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