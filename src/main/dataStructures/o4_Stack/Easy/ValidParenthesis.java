package dataStructures.o4_Stack.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {



    public static void main(String[] args) {
        String s = "){"; // "()[]{}";
        ValidParenthesis v = new ValidParenthesis();
        Boolean result = v.isValid(s);
        System.out.println("Result: " + result);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> paramConfig = new HashMap();
        paramConfig.put('(', ')');
        paramConfig.put('{', '}');
        paramConfig.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            if(s.length() % 2 != 0)
                return false;
            if ("({[".contains(Character.toString(s.charAt(i))))
                stack.push(s.charAt(i));
            else if(")}]".contains(Character.toString(s.charAt(i))) && !stack.empty() &&  s.charAt(i) == paramConfig.get(stack.peek()))
                stack.pop();
            else return false;
        }
        if (stack.empty())
            return true;
        else
            return false;
    }
}