package com.example.android.notepad;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.example.android.notepad.NotesList;

public class IPOGMM_2_WAYM6Test extends
		ActivityInstrumentationTestCase2<NotesList> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c19 c13 c7 
	 *
	 * 
	 */
	@Smoke 
	public void test_c25(){
		try {
			// Trigger web events
			driver.clickInList(0);
			driver.enterText(0, "7sl254h");
			driver.enterText(0, "yx71");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c19 c15 c9 
	 *
	 * 
	 */
	@Smoke 
	public void test_c26(){
		try {
			// Trigger web events
			driver.clickInList(0);
			driver.enterText(0, "$$##");
			driver.enterText(0, "cjzl4bj");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c21 c13 c9 
	 *
	 * 
	 */
	@Smoke 
	public void test_c27(){
		try {
			// Trigger web events
			driver.clickInList(0);
			driver.enterText(0, "7w39");
			driver.enterText(0, "$$$$$");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c21 c15 c7 
	 *
	 * 
	 */
	@Smoke 
	public void test_c28(){
		try {
			// Trigger web events
			driver.clickInList(0);
			driver.enterText(0, "#%#$");
			driver.enterText(0, "%#%#");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGMM_2_WAYM6Test(){
		super("com.example.android.notepad", NotesList.class);
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