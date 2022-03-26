package Java001.src.com.company.jetbrainsAcademy.tempPrograms;
import java.util.Scanner;

public class SumOfDividersBySix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIX = 6;
        int lengthOfSequence = scanner.nextInt();
        int[] sequence = new int[lengthOfSequence];
        int sumOfDividersBySix = 0;
        // 7  99 36 12 88 83 6 90  > 144
        for (int i = 0; i < lengthOfSequence; i++) {
            sequence[i] = scanner.nextInt();
            if (sequence[i] % SIX == 0) {
                sumOfDividersBySix += sequence[i];
            }
        }
        System.out.println(sumOfDividersBySix);
    }
}