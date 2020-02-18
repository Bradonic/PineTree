package org.example;

import java.util.Scanner;

/**
 * Author: Bradley van der Westhuizen (217218903)
 * Date: 15 February 2020
 * Print pine tree using hashes
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How tall is the tree: ");
        int height = sc.nextInt();
        int spaces = 0;
        int hashes = height;
        int stumpSpaces = height - 1;
        for (int k = 0; k < stumpSpaces; k++) {
            System.out.print(" ");
        }
        System.out.println("#");
        while (height != 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < hashes * 2; j++) {
                System.out.print("#");
            }
            System.out.println("");
            spaces++;
            hashes--;
            height--;
        }
    }
}
