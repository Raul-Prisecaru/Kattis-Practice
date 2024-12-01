package org.example.easy;

import java.util.Scanner;

public class takkar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trumpButton = scanner.nextInt();
        int kimButton = scanner.nextInt();

        if (trumpButton > kimButton){
            System.out.println("MAGA!");
        }

        if (trumpButton == kimButton) {
            System.out.println("WORLD WAR 3!");
        }

        if (trumpButton < kimButton) {
            System.out.println("FAKE NEWS!");
        }
    }
}
