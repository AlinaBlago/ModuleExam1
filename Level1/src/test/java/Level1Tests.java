import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Level1Tests {
    @Test
    public void countOfUniqueNumbers(){
        ArrayList<Integer> source = new ArrayList<Integer>(Arrays.asList(1, 0 , 1, 2, 3, 4, 5));
        int expectedTrue = 6;
        int expectedFalse = 7;

        int actual = LevelOneTasks.countOfUniqueNumbers(source);
        assertEquals("OK", expectedTrue, actual);
        assertFalse("Problem", expectedFalse == actual);
    }

    @Test
    public void stepKnightInfinityDeck(){
        int sourceKnightX = 0;
        int sourceKnightY = 0;
        int sourcePointX = 2;
        int sourcePointY = 1;

        String expectedTrue = "yes";

        String actual = LevelOneTasks.stepKnightInfinityDeck(sourceKnightX, sourceKnightY, sourcePointX, sourcePointY);
        assertTrue("OK", expectedTrue == actual);

    }

    @Test
    public void perimeterOfTriangle(){
        int sourceAx = 1;
        int sourceAy = 0;
        int sourceBx = 1;
        int sourceBy = 1;
        int sourceCx = 2;
        int sourceCy = 3;

        double expected = 7.255832815336874;

        double actual = LevelOneTasks.perimeterOfTriangle(sourceAx, sourceAy, sourceBx, sourceBy, sourceCx, sourceCy);
        if (expected == actual) {
            assertTrue("OK", expected == actual);
        } else {
            assertTrue("Problem", expected != actual);
        }
    }



}
