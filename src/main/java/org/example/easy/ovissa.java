package org.example.easy;

import java.util.Scanner;

public class ovissa {


    public static void main(String[] args) {
        int uncertainty_level = 0;
        Scanner scanner = new Scanner(System.in);
        String sound_uncertainty = scanner.next();
        String[] arr_uncertain = sound_uncertainty.split("");

        for (String character : arr_uncertain) {
            uncertainty_level++;
        }
        System.out.println(uncertainty_level);

    }

}
