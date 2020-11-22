package com.mshetty;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        boolean result = isValid("(())");
        System.out.println(result);
    }

    public static boolean isValid(String s){
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);

            if(map.containsKey(ch)){
                Character topElement = stack.isEmpty() ? '#' : stack.pop();
                if(topElement != map.get(ch)){
                    return false;
                }

            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
