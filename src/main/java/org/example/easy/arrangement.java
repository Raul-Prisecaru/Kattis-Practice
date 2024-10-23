package org.example.easy;

import java.util.Scanner;

public class arrangement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N_lines = scanner.nextInt();
        int M_copies = scanner.nextInt();

        String total_star = "";

        for (int i = 0; i < M_copies; i++) {
            total_star += "*";
        }
        
        for (int j = 0; j < N_lines; j++)
            if (j == N_lines){

            }
            System.out.print(total_star);

//        for (int i = 0; i < N_lines; i++) {
//            System.out.print("\n");
//            for (int j = 0; j < M_copies; j++) {
//                String total_stars = "*";
//                System.out.print(total_stars);
//            }
//        }
    }
}
