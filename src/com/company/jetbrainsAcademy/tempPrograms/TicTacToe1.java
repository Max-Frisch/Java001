package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class TicTacToe1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lines = "---------";
        String inputString = scanner.next();

        char[] lineOne = {inputString.charAt(0), inputString.charAt(1), inputString.charAt(2)};
        char[] lineTwo = {inputString.charAt(3), inputString.charAt(4), inputString.charAt(5)};
        char[] lineThree = {inputString.charAt(6), inputString.charAt(7), inputString.charAt(8)};
        String charArray;

        System.out.println(lines);
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            if (i == 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(lineOne[j] + " ");
                }
                System.out.println("|");
            } else if (i == 1) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(lineTwo[j] + " ");
                }
                System.out.println("|");
            } else {
                for (int j = 0; j < 3; j++) {
                    System.out.print(lineThree[j] + " ");
                    }
                }
            }
            System.out.println("|");
        System.out.println(lines);
    }

}
