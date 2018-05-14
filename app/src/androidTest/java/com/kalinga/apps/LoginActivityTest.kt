package com.kalinga.apps

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by "lkb" on 5/11/2018.
 */
@RunWith(AndroidJUnit4::class)
class LoginActivityTest{
    @Rule
    @JvmField
    val activity = ActivityTestRule<LoginActivity>(LoginActivity::class.java)

    @Test
    fun alphaCheck() {
        onView(withId(R.id.background_view))
                .check(matches(withAlpha(0.6F)))
    }
}