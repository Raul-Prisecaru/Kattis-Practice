package org.example.easy;

import java.util.Scanner;

public class autori {

    public String initials() {
        Scanner scanner = new Scanner(System.in);
        String intials_return = "";

        String input = scanner.next();
        String[] input_split = input.split("-");

        for (String word : input_split) {
            intials_return += word.charAt(0);
        }

        System.out.println(intials_return);
        return intials_return;
    }

    public static void main(String[] args) {
        autori autori = new autori();

        autori.initials();
    }
}
