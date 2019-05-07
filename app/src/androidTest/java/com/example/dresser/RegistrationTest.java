package com.example.dresser;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrationTest {

    @Rule
    public ActivityTestRule<Registration> mActivityTestRule = new ActivityTestRule<Registration>(Registration.class);

    private Registration mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }
    @Test
    public  void testLaunch(){
        View view = mActivity.findViewById(R.id.idB_submit);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}