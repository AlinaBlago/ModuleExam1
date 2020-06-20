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


    public static String stepKnightInfinityDeck(int knightX , int knightY , int pointX , int pointY){

        int knightXVector = knightX - (knightX + 2);
        int knightYVector = knightY - (knightY + 1);
        final double lengthOfVector = Math.sqrt(Math.pow(knightXVector , 2) + Math.pow(knightYVector , 2));

        int knightPointXVector = knightX - pointX;
        int knightPointYVector = knightY - pointY;
        final double lengthOfKnightVector = Math.sqrt(Math.pow(knightPointXVector , 2) + Math.pow(knightPointYVector , 2));

        return (lengthOfVector == lengthOfKnightVector) ? "yes" : "no";
    }

    public static double perimeterOfTriangle(int aX, int aY, int bX, int bY, int cX, int cY){
        double lengthAB = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
        double lengthAC = Math.sqrt(Math.pow(cX - aX, 2) + Math.pow(cY - aY, 2));
        double lengthBC = Math.sqrt(Math.pow(cX - bX, 2) + Math.pow(cY - bY, 2));
        double perimeter = lengthAB + lengthAC + lengthBC;
        return perimeter;
    }

}
