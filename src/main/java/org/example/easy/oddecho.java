package org.example.easy;
import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_text = scanner.nextInt();

        String[] text_split = new String[number_text];



        for (int i = 0; i < (text_split.length); i++){
            String text = scanner.next();
            text_split[i] = text;
        }
//
//

        for (int i = 0; i < text_split.length; i++) {
            if ((i % 2 == 0)) {
                System.out.println(text_split[i]);
            }
        }
    }
}
