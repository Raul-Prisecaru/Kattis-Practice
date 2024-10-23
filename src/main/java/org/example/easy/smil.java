package org.example.easy;

import java.util.Objects;
import java.util.Scanner;

public class smil {

    public void face_search() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        String[] arr = input.split("");

        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], ":") || Objects.equals(arr[i], ";")) {

                if ((i+1) == arr.length) {
                    break;
                }


                if (Objects.equals(arr[i+1], ")")) {
                    System.out.println(i);
                }

                if (Objects.equals(arr[i+1], "-")) {

                    if ((i+2) == arr.length) {
                        break;
                    }
                    if (Objects.equals(arr[i+2], ")")) {
                        System.out.println(i);
                    }
                }

            }

        }
    }

    public static void main(String[] args) {
        smil smil = new smil();

        smil.face_search();
    }
}
