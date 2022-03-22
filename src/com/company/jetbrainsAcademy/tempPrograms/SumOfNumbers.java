package Java001.src.com.company.jetbrainsAcademy.tempPrograms;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int low = scanner.nextInt();
        int high = scanner.nextInt();
        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
