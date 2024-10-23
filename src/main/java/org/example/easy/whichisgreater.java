package org.example.easy;

import java.util.Scanner;

public class whichisgreater {
    public void checker(String[] arr) {
        int number1 = Integer.parseInt(arr[0]);
        int number2 = Integer.parseInt(arr[1]);

        if (number1 > number2) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }

    public static void main(String[] args) {
        whichisgreater whichisgreater = new whichisgreater();
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();

        String[] numbers_split = numbers.split(" ");
        whichisgreater.checker(numbers_split);
    }
}
