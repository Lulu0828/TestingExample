package com.lulu.testingexample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentationTest {
    val STRING_TO_BE_TYPED: String = "Peter"

    @get:Rule
    var mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun sayHello(){
        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard())

        onView(withText("Say hello!")).perform(click())

        val expectedText: String = "Hello, " + STRING_TO_BE_TYPED + "!"
        onView(withId(R.id.textView)).check(matches(withText(expectedText)))
    }
}