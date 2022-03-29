package Java001.src.com.company.jetbrainsAcademy.tempPrograms;
import java.util.Scanner;

public class SquaresOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int squareNumber = 1;
        int squareNumberProduct = 0;

        do {
            squareNumberProduct = squareNumber * squareNumber;
            if (squareNumberProduct <= inputNumber) {
                System.out.println(squareNumberProduct);
            }
            squareNumber++;
        } while (squareNumberProduct < inputNumber);
    }
}
