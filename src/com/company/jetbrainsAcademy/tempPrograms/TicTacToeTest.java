package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class TicTacToeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String s = scanner.next();

        System.out.println("---------");
        System.out.println(" " + "| " + s.charAt(0) + " " + s.charAt(1) + " " + s.charAt(2) + " |" + " ");
        System.out.println(" " + "| " + s.charAt(3) + " " + s.charAt(4) + " " + s.charAt(5) + " |" + " ");
        System.out.println(" " + "| " + s.charAt(6) + " " + s.charAt(7) + " " + s.charAt(8) + " |" + " ");
        System.out.println("---------");
    }
}