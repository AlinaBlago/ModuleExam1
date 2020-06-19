import java.util.*;

public class LevelOneTasks {
    public static int countOfUniqueNumbers(ArrayList<Integer> numbers){
        HashSet<Integer> setValues = new HashSet<Integer>();
        for (int number: numbers) {
            if(!setValues.contains(number)){
                setValues.add(number);
            }
        }

        return setValues.size();
    }


    public static String stepKnightfInfinityDeck(int knightX , int knightY , int pointX , int pointY){

        int knightXVector = knightX - (knightX + 2);
        int knightYVector = knightY - (knightY + 1);
        final double lengthOfVector = Math.sqrt(Math.pow(knightXVector , 2) + Math.pow(knightYVector , 2));

        int knightPointXVector = knightX - pointX;
        int knightPointYVector = knightY - pointY;
        final double lengthOfKnightVector = Math.sqrt(Math.pow(knightPointXVector , 2) + Math.pow(knightPointYVector , 2));

        return (lengthOfVector == lengthOfKnightVector) ? "yes" : "no";
    }


}
