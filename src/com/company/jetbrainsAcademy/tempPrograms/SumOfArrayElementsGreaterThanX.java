package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class SumOfArrayElementsGreaterThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] numberArray = new int[lengthOfArray];
        int n = 0;
        int sum = 0;

        // filling the int array
        for (int i = 0;i < lengthOfArray; i++) {
            numberArray[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        // looping over the array, summing up all numbers > n
        for (int num: numberArray) {
            if (num > n) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
