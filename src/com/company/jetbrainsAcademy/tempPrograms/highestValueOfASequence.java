package Java001.src.com.company.jetbrainsAcademy.tempPrograms;
import java.util.Scanner;

public class highestValueOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfSequence = scanner.nextInt();
        int[] sequence = new int[lengthOfSequence];
        int highestDevisorByFour = 0;
        // 6 23 12 33 40 77 80
        for (int i = 0; i < lengthOfSequence; i++) {
            sequence[i] = scanner.nextInt();
            if (sequence[i] % 4 == 0 && (highestDevisorByFour == 0 || highestDevisorByFour < sequence[i])) {
                    highestDevisorByFour = sequence[i];
            }
        }
        System.out.println(highestDevisorByFour);
    }
}