package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 2;
        int end = 12;
        int accumulator = 1;                   // (1)
        for (int i = start; i <= end; i++) {   // (2)
            accumulator *= i;                  // (3)
            System.out.println(accumulator);
        }
    }
}

