import java.util.Stack;

public class StringReverse {

    public static String reverse(String data) {
        Stack<Character> stack = new Stack<>();
        char[] chars = data.toCharArray();

        for(char c : chars) {
            stack.push(c);
        }

        for(int i = 0; i < data.length(); i++) {
            chars[i] = stack.pop();
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Initial string --> " + str);
        System.out.println("Reversed string --> " + reverse(str));

    }
}
