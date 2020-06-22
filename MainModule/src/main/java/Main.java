import levelThreeTask.LifeLogic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       System.out.println("Level 1: ");
        System.out.println("Task 1:\n Array = 1,1,2,3,4,4,5\n Count of unique numbers: " + LevelOneTasks.countOfUniqueNumbers(new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,4,5))));

        System.out.println("\nTask 2:\n Can knight(x = 0,y = 0) beat future point(x = 2 , y = 1)\n" + LevelOneTasks.stepKnightInfinityDeck(0,0,2,1));

        System.out.println("\nTask 3:\n Perimeter of triangle: " + LevelOneTasks.perimeterOfTriangle(0, 0, 1, 1, 2, 3));

        System.out.println("\nLevel 2: ");
        System.out.println("Task 1: ");
        System.out.println(LevelTwoTasks.ifStringAllowable("(Реализация {заданий позволяет [выполнять] важные задания} по разработке [систем] массового участия.)"));
        System.out.println(LevelTwoTasks.ifStringAllowable("({])"));
        System.out.println(LevelTwoTasks.ifStringAllowable(""));

        System.out.println("\nTask 2: ");
        System.out.println("Max length of tree:" + LevelTwoTasks.maxLengthOfTreeNode(new ArrayList<Integer>(Arrays.asList(14 ,9, 1, 2, 1 ,14, 20 ,13))));


        System.out.println("\nLevel 3: ");
        System.out.println("\nGame Life ");
        LifeLogic life = new LifeLogic(10,10,2);
        int[][]matrix = life.getMatrix();

        System.out.println("\nSource matrix:");
        for (int i = 0 ; i< 10;i++){
            for(int j=0;j<10;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        matrix = life.calculateAndGetNextGeneration();

        System.out.println("\nNew matrix:");
        for (int i = 0 ; i< 10;i++){
            for(int j=0;j<10;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
