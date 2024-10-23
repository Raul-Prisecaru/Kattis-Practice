package org.example.easy;

import java.util.Objects;
import java.util.Scanner;

public class fjoldibokstafa {
    public static void main(String[] args) {
        String[] arr = {
                "a", "b", "c", "d", "e", "f", "g","h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z"
        };
        Scanner scanner = new Scanner(System.in);
        String characterInput = scanner.next();
        int counter = 0;

        String[] character_split = characterInput.split("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < character_split.length; j++) {
                if (Objects.equals(character_split[j], arr[i]) || (Objects.equals(character_split[j], arr[i].toUpperCase()))) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
