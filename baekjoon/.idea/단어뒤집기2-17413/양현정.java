package dev.syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < c.length; ++i) {
            if (c[i] == '<') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                while (true) {
                    char cc = c[i];
                    System.out.print(cc);
                    if (cc == '>') break;
                    i++;
                }
            } else if (c[i] == ' ') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(' ');
            } else {
                stack.push(c[i]);
            }
        }
    }
}