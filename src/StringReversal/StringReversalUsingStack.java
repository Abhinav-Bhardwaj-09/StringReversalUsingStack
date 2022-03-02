package StringReversal;

import java.util.*;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 03/03/22
 * Time: 00:39
 */


public class StringReversalUsingStack {

    static String StringReversal (String s) {
        char[] reversedStringArray = new char[s.length()];
        Stack<Character> stack = new Stack<Character>();

        int index;

        for (index = 0; index < s.length(); index++) {
            stack.push(s.charAt(index));
        }

        index = 0;

        while (!stack.isEmpty()) {
            reversedStringArray[index++] = stack.pop();
        }

        String reversedString = new String(reversedStringArray);

        return reversedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String s = StringReversal(S);
        System.out.println(s);
    }
}
