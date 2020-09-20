package com.example.android.notepad;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.example.android.notepad.NotesList;

public class IPOGPO_2_WAYM11Test extends
		ActivityInstrumentationTestCase2<NotesList> {

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
			driver.clickLongOnText("Note1");
//			driver.clickOnText("Edit title");
//			driver.enterText(0, "i93");
			driver.goBack();

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
			driver.clickLongOnText("Note1");
			driver.clickOnText("Edit title");
			driver.enterText(0, "$$#%");
//			driver.goBack();

			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGPO_2_WAYM11Test(){
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