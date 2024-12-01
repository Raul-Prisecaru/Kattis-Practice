package org.example.easy;

import java.util.Scanner;

public class telja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 1; i < count + 1; i++) {
            System.out.println(i);
        }
    }
}
