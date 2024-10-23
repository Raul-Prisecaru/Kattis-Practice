package org.example.easy;

import java.util.Scanner;

public class Fimmtudagstilbod {
    public static void main(String[] args) {
        int start_year = 1993;
        int end_year = 2020;
        int after_year_increase = 100;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        int year_input = scanner.nextInt();

        if (year_input <= end_year && year_input >= start_year) {
            total = 1000;
            System.out.println(total);
        }

        if (year_input > end_year) {
            int find_year = year_input - end_year;
            total = (after_year_increase * find_year) + 1000;
            System.out.println(total);
        }


    }

}
