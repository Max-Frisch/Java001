package Java001.src.com.company.jetbrainsAcademy.tempPrograms;

public class TicTacToe {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
        }
    }
}