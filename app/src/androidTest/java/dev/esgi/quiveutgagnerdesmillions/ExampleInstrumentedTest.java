package dev.esgi.quiveutgagnerdesmillions;

import android.view.View;
import android.widget.Button;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import androidx.test.espresso.ViewAssertion;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> myActivity = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testBackToHome(){
        onView(withId(R.id.btn_quit)).check(matches(isChecked()));
    }

    @Test
    public void testRightAnswer(){
        onView(withId(R.id.ansTrue)).check(matches(isSelected()));
    }

    @Test
    public void testMessageEndGame(){
        onView(withId(R.id.gameoverText)).check(matches(withText("GAME OVER")));
    }

    @Test
    public void testBtnIsNotEnabled(){
        onView(withId(R.id.btn_start)).check(matches(isEnabled()));
    }

}
