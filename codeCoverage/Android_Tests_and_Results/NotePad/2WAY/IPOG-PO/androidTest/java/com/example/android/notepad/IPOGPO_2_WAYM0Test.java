package com.example.android.notepad;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.example.android.notepad.NotesList;

public class IPOGPO_2_WAYM0Test extends
		ActivityInstrumentationTestCase2<NotesList> {

	private Solo driver;

	//-- test cases -----------------------------------//
	 	/**
	 * Default test case
	 *
	 * 
	 */
	@Smoke 
	public void testEventSequence(){
		try {
			// Trigger web events
			driver.clickLongOnText("Note1");
			driver.clickOnText("Open");


			//TODO specify assertions
		} catch(Exception e){
			e.printStackTrace();
		}
	}



	//-------------------------------------------------//

	public IPOGPO_2_WAYM0Test(){
		super("com.example.android.notepad", NotesList.class);
	}

	@Override
	public void setUp() throws Exception {
		driver = new Solo(getInstrumentation(), getActivity());
		 for (int i = 0; i < 6; i++){
            driver.clickOnMenuItem("Add note");
            driver.enterText(0, "Note" + i);
            driver.clickOnMenuItem("Save");
        }
	}


	@Override
	public void tearDown() throws Exception {
		// Robotium will finish all the activities that have been opened
		driver.finishOpenedActivities();
	}
}