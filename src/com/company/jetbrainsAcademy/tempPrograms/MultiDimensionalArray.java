package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayOneLength = scanner.nextInt();
        int arrayTwoLength = scanner.nextInt();
        int[][] twoDimArray = new int[arrayOneLength][arrayTwoLength];
        int[][] twoDimArrayTwo = new int[arrayTwoLength][arrayOneLength];

        for (int i = 0; i < arrayOneLength; i++) { // 2 times
            for (int j = 0; j < arrayTwoLength; j++) { // 3 times
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < arrayTwoLength; i++) {
            for (int j = arrayOneLength - 1; j >= 0; j--) {
                System.out.print(twoDimArray[j][i] + " ");
            }
            System.out.println();
        }
    }
}
