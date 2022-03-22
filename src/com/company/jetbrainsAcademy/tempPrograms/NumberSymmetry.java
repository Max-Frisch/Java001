package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class NumberSymmetry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  1001
        int number = scanner.nextInt();
        int firstDigit = number / 1000;
        int secondDigit = (number % 1000) / 100;
        int thirdDigit = ((number % 1000) % 100) / 10;
        int fourthDigit = (((number % 1000) % 100) % 10) / 1;

        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit);
        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
