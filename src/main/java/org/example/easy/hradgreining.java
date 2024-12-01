package org.example.easy;

import java.util.Scanner;

public class hradgreining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dnaString = scanner.next();

        if (dnaString.contains("COV")) {
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }
    }
}
