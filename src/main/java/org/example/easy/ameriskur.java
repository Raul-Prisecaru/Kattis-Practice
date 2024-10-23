package org.example.easy;

import java.util.Scanner;

public class ameriskur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double football_kilometer_convert = 0.09144;
        int football_field_size = scanner.nextInt();

        System.out.println(football_kilometer_convert * football_field_size);



    }
}
