package org.example.easy;

import java.util.Scanner;

public class storafmaeli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (year % 10 == 0) {
            System.out.println("Jebb");
        }
        else {
            System.out.println("Neibb");
        }
    }
}
