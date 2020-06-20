import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Level2Tests {

    @Test
    public void ifStringAllowable(){
        String source = "(Реализация {заданий позволяет [выполнять] важные задания} по разработке [систем] массового участия.)";

        String expectedTrue = "yes";

        String actual = LevelTwoTasks.ifStringAllowable(source);
        assertTrue("OK", expectedTrue == actual);
    }

    @Test
    public void ifStringNotAllowable(){
        String source = "(Реализация {заданий позволяет [выполнять] важные задания} по разработке [систем] массового участия.))))";

        String expectedTrue = "no";

        String actual = LevelTwoTasks.ifStringAllowable(source);
        if (actual == null || actual == expectedTrue)
        assertTrue("OK", expectedTrue == actual);
    }

    @Test
    public void maxLengthOfTreeNode(){
        ArrayList<Integer> source = new ArrayList<Integer>(Arrays.asList(14, 9, 1, 14, 20, 13));
        int expected = 3;
        int actual = LevelTwoTasks.maxLengthOfTreeNode(source);
        assertEquals("OK", expected, actual);
    }
}
