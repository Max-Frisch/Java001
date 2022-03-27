package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

import java.util.Scanner;

public class InvestmentTimeCalc {
    private static final int HUNDRED = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double principal;
        double percent;
        double endCapital;
        int numberOfYears = 0;

        principal = scanner.nextDouble();
        percent = scanner.nextDouble();
        endCapital = scanner.nextDouble();
        while ( principal < endCapital) {
            numberOfYears += 1;
            principal = principal + principal * (percent / HUNDRED);
        }
        System.out.println(numberOfYears);
    }
}
