package Bai_Tap20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B20 {
    //Một chuỗi chỉ chứa dấu ngoặc đơn được cân bằng nếu những điều sau đây đúng:
    // 1. nếu nó là một chuỗi rỗng
    // 2. nếu A và B đúng, AB đúng,
    // 3. nếu A đúng, (A) và {A} và [ A] cũng đúng.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(isBalanced(s) ? "true" : "false");
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
