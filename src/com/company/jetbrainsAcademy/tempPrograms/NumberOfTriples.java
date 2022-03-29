package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class NumberOfTriples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        int tripleCounter = 0;

        // filling the array with numbers
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        // iterate over array, doing some weird stuff..
        for (int i = 1; i < arrayLength - 1; i++) {
            if (numbers[i - 1] == numbers[i] - 1 && numbers[i] == numbers[i + 1] - 1) {
                tripleCounter++;
            }
        }
        System.out.println(tripleCounter);

    }
}