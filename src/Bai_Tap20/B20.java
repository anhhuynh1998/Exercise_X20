package Bai_Tap20;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class B20 {
    //Một chuỗi chỉ chứa dấu ngoặc đơn được cân bằng nếu những điều sau đây đúng:
    // 1. nếu nó là một chuỗi rỗng
    // 2. nếu A và B đúng, AB đúng,
    // 3. nếu A đúng, (A) và {A} và [ A] cũng đúng.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            boolean balanced = isBalanced(s);
            System.out.println(balanced);
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
