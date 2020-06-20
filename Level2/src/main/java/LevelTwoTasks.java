import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LevelTwoTasks {
    public static String ifStringAllowable(String checkableString){
        System.out.println("\nEntered string:" +checkableString);

        if(checkableString.length() == 0) return "yes";

        Stack<Character> openBrackets = new Stack<Character>();

        for (char symbol : checkableString.toCharArray()){

            if(symbol == '{' || symbol == '(' || symbol == '['){
                openBrackets.push(symbol);
            }
            else if(symbol == '}' || symbol == ')' || symbol == ']'){
                if(openBrackets.size() == 0){
                    return "no";
                }

                char currentOpenBracket = openBrackets.peek();

                switch (currentOpenBracket){
                    case '(':{
                        if (symbol == ')'){
                            openBrackets.pop();
                            continue;
                        }
                        return "no";
                    }
                    case '{':{
                        if (symbol == '}'){
                            openBrackets.pop();
                            continue;
                        }
                        return "no";
                    }
                    case '[':{
                        if (symbol == ']'){
                            openBrackets.pop();
                            continue;
                        }
                        return "no";
                    }
                }
            }
        }

        return openBrackets.size() == 0 ? "yes" : "no";
    }

    public static int maxLengthOfTreeNode(ArrayList<Integer> values){

        if(values.size() == 0){
            return 0;
        }

        BinaryTree tree = new BinaryTree();

        for(int value : values){
            tree.add(value);
        }

        return tree.getHeight();
    }

}
