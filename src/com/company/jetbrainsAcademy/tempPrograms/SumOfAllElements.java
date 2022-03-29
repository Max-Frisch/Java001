package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 1;
        int sum = 0;

        while (inputNumber != 0) {
            inputNumber = scanner.nextInt();
            sum += inputNumber;
        }
        System.out.println(sum);
    }
}
