package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class RepeatingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 0; j < i; j++ ) {
                if (count >= inputNumber) {
                    break;
                }
                System.out.print(i + " ");
                count++;
                if (i == 1) {
                    break;
                }
            }
        }
    }
}
