/**
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Hide Tags Stack String
*/

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null) return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else if (stack.empty() || c == ')' && stack.pop() != '('
                || c == '}' && stack.pop() != '{' || c == ']' && stack.pop() != '[')
                return false;
        }
        return stack.empty();
    }
}