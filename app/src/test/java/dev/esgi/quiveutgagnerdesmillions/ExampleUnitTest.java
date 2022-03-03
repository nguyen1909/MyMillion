package dev.esgi.quiveutgagnerdesmillions;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AlertDialog;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testGetAsk(){
        Question q1 = new Question("What is the capital of France","Italy","Lyon",
                "Nantes","Paris");
        assertTrue(q1.getAsk()=="What is the capital of France");
    }

    @Test
    public void testGetAns1(){
        Question q1 = new Question("What is the capital of France","Italy","Lyon",
                "Nantes","Paris");
        assertTrue("Answer 1", q1.getAns1()=="Italy");
    }

    @Test
    public void testExactAnswer(){
        Question q1 = new Question("What is the capital of France","Italy","Lyon",
                "Nantes","Paris");
        assertTrue("Good answer", q1.getAnsTrue()=="Paris");
    }

    @Test
    public void testLoose(){
        int result = MainActivity.score;
        assertTrue("You loose",result<4);
    }

}