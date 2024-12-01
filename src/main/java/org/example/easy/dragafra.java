package org.example.easy;

import java.util.Scanner;

public class dragafra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int windowCovered = scanner.nextInt();
        int windowOpened = scanner.nextInt();

        System.out.println(windowCovered - windowOpened);
    }
}
