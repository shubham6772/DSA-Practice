package Stack;

import java.util.*;

public class DuplicateBrackets {

    public static void duplicacy(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (stack.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        System.out.println(false);

    }

    public static void main(String[] args) {
        String str[] = new String[] { "((a+b)+(c+d))", "(a+b)+((c+d))" };


        for(int i = 0; i < str.length; i++) {
            duplicacy(str[i]);
        }
    }
}
