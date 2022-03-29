package Java001.src.com.company.jetbrainsAcademy.tempPrograms;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        int sum = 0;

        for(int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        for(int num: numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}

