package org.example.easy;

import java.util.Objects;
import java.util.Scanner;

public class kikiboba {
    private int K_char = 0;
    private int B_char = 0;

    public void search(String[] word) {


        for (int i = 0; i < word.length; i++) {
            if (Objects.equals(word[i], "k")) {
                K_char++;
            }

            if (Objects.equals(word[i], "b")) {
                B_char++;
            }
        }

        if (K_char > B_char) {
            System.out.println("kiki");
        }

        if (B_char > K_char) {
            System.out.println("boba");
        }

        if ((B_char == K_char) && ((B_char > 0) && (K_char > 0))) {
            System.out.println("boki");

        }

        if (B_char == 0 && K_char == 0) {
            System.out.println("none");
        }



    }

    public static void main(String[] args) {
        kikiboba kikiboba = new kikiboba();
        Scanner scanner = new Scanner(System.in);
        String word_input = scanner.next();
        String[] word_input_split = word_input.split("");

        kikiboba.search(word_input_split);



    }
}
