package org.example.easy;

import java.util.Scanner;

public class leggjasaman {

    private int HannesCars;
    private int ArnarCars;

    public int totalCars() {
        Scanner scanner = new Scanner(System.in);
        this.HannesCars = scanner.nextInt();
        this.ArnarCars = scanner.nextInt();

        return this.HannesCars + this.ArnarCars;

    }

    public static void main(String[] args) {
        leggjasaman leggjasaman = new leggjasaman();
        System.out.println(leggjasaman.totalCars());
    }
}
