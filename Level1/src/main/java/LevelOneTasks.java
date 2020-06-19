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



}
