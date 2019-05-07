package com.example.dresser;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {
    @Rule
    public ActivityTestRule<Login> mActivityTestRule = new ActivityTestRule<Login>(Login.class);

    private Login mActivity = null;

    @Before
    public void setUp() throws Exception {
      mActivity = mActivityTestRule.getActivity();
    }
    @Test
    public  void testLaunch(){
        View view = mActivity.findViewById(R.id.recycler_view);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}