package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class CollatzConjecture {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.print(number + " ");
        while (number > ONE) {
            if (number % TWO == ZERO) {
                number /= TWO;
            } else {
                number = number * THREE + ONE;
            }
            System.out.print(number + " ");
        }
    }
}
