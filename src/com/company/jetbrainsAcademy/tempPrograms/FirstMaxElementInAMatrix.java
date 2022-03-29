package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class FirstMaxElementInAMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int num1 = 0;
        int num2;
        int findRow = 0;
        int findCol = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num2 = matrix[i][j];
                if (num2 > num1) {
                    num1 = num2;
                    findRow = i;
                    findCol = j;
                }
            }
        }
        System.out.println(findRow + " " + findCol);
    }
}
