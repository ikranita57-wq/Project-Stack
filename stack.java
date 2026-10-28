import java.util.Stack;

public class stack {

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println("Example 1: " +
                removeDuplicates("abbaca"));

        System.out.println("Example 2: " +
                removeDuplicates("azxxzy"));

        System.out.println("Example 3: " +
                removeDuplicates("abcd"));

        System.out.println("Example 4: " +
                removeDuplicates("aabbcc"));
    }
}
