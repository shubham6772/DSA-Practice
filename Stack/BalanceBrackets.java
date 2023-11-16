package Stack;

import java.util.*;

public class BalanceBrackets {

    public static void balancing(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
           
           
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.peek() == '{' &&  ch == '}' || stack.peek() == '(' && ch == ')' || stack.peek() == '[' && ch == ']') {
                    stack.pop();
                } else {
                   
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);

    }

    public static void main(String[] args) {
        String str[] = new String[] { "[(a+b)+{(c+d)*(e/f)}]", "[(a+b)+{(c+d)*(e/f)]}" };

        for (int i = 0; i < str.length; i++) {
            balancing(str[i]);
        }
    }
}
