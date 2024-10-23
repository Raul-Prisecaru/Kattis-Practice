package org.example.easy;

import java.util.Scanner;

public class leynithjonusta {
    private int at_symbol_counter = 0;

    public void conduct(String[] arr) {
        String fullEmail = "";

        for (int i = 0; i < arr.length; i++) {
            fullEmail += arr[i];

//            if (!Objects.equals(arr[i], "@")) {
//                fullEmail += arr[i];
//            }
//
//            if (Objects.equals(arr[i], "@")){
//                if (at_symbol_counter < 1) {
//                    at_symbol_counter++;
//                    fullEmail += arr[i];
//                }
//
//            }

        }
        System.out.println(fullEmail);
    }


    public static void main(String[] args) {
        leynithjonusta leyniþjónusta = new leynithjonusta();
        Scanner scanner = new Scanner(System.in);

        String space_email = scanner.nextLine();
        String[] space_email_array = space_email.split(" ");

        leyniþjónusta.conduct(space_email_array);
    }
}
