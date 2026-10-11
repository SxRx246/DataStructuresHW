package com.ga.stack.exercise2;

import com.ga.stack.SingleArrayStack;

public class ExpressionBalancing {
    public static boolean isBalanced(String exp) {
        if (exp == null) {
            return false;
        }
        SingleArrayStack stack = new SingleArrayStack(exp.length());
        boolean balanced = true;

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (balanced) {
            System.out.println(exp + " is balanced");
        } else {
            System.out.println(exp + " not balanced");
        }
        return balanced;
    }

    public static void main(String[] args) {
        String[] expressions = {
                "{a + (b * c)}",
                "[(a + b) * c]",
                "{(a + b]}",
                "((a + b)",
                "a + b)"
        };

        for(String expression : expressions){
            isBalanced(expression);
        }

    }
}