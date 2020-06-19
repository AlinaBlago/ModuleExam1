import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Level 1 : ");
        System.out.println("Task 1:\n Array = 1,1,2,3,4,4,5\n Count of unique numbers: " + LevelOneTasks.countOfUniqueNumbers(new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,4,5))));

        System.out.println("Task 2:\n Can knight(x = 0,y = 0) beat future point(x = 2 , y = 1)\n" + LevelOneTasks.stepKnightfInfinityDeck(0,0,2,1));

        System.out.println("Task 3:\n Perimeter of triangle: " + LevelOneTasks.perimeterOfTriangle(0, 0, 1, 1, 2, 3));
    }
}
