package Bai_Tap20;

public class RandomHourglass {
    public static int[][] createRandomHourglass() {
        int[][] hourglass = new int[6][6];
        for (int i = 0; i < hourglass.length; i++) {
            for (int j = 0; j < hourglass[i].length; j++) {
                hourglass[i][j] = (int) (Math.random() * 10);
            }
        }
        return hourglass;
    }
}
