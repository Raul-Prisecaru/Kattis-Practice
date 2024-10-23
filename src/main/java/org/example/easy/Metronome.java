package org.example.easy;

import java.util.Scanner;

public class Metronome {
    private int ticks = 4;


    public void calculate(int revolution) {
        float calculation = (float) revolution / ticks;
        System.out.println(calculation);
//        System.out.println(Float.parseFloat(String.valueOf(calculation)));
    }
    public static void main(String[] args) {
        Metronome metronome = new Metronome();
        Scanner scanner = new Scanner(System.in);

        int revolution_input = scanner.nextInt();

        metronome.calculate(revolution_input);
    }
}
