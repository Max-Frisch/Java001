package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class SmallestFactorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNumber;
        long factorialSum = 1L;
        int smallestFactorial = 1;

        inputNumber = scanner.nextLong();

        while (factorialSum <= inputNumber) {
            smallestFactorial += 1;
            factorialSum = factorialSum * smallestFactorial;
        }

        System.out.println(smallestFactorial);
    }
}
