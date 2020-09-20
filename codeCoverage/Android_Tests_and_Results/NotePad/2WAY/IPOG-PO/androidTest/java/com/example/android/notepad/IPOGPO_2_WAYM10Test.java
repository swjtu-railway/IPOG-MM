package com.example.android.notepad;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.example.android.notepad.NotesList;

public class IPOGPO_2_WAYM10Test extends
		ActivityInstrumentationTestCase2<NotesList> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * c15 c7 
	 *
	 * 
	 */
	@Smoke 
	public void test_c20(){
		try {
			// Trigger web events
			driver.clickInList(0);
			driver.enterText(0, "$%$%");
			driver.clickOnMenuItem("Edit title");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}


 	/**
	 * c13 c9 
	 *
	 * 
	 */
	@Smoke 
	public void test_c21(){
		try {
			// Trigger web events
			driver.clickInList(0);
			driver.enterText(0, "ye");
			driver.clickOnMenuItem("Edit title");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGPO_2_WAYM10Test(){
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