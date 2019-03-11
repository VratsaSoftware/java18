import java.util.Stack;

public class TaskStack {

    public static void main(String[] args) {
        String expression = "(1+2) * ((5+6) + (7/5)))";
        System.out.println(checkForValidBrackets(expression));
    }

    private static boolean checkForValidBrackets(String expression) {
        Stack stack = new Stack();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
