package org.example.easy;

import java.util.Scanner;

public class tolvunarfraedingartelja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number - 1);
        } else {
            System.out.println(0);
        }


    }
}
