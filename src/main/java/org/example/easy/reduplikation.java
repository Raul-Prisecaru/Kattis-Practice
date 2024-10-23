package org.example.easy;

import java.util.Scanner;

public class reduplikation {
    public static void main(String[] args) {
        String s = "";
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int repeat = scanner.nextInt();

        for (int i = 0; i < repeat; i++) {
            s += word;
        }
        System.out.println(s);
    }
}
