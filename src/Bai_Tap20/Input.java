package Bai_Tap20;
import java.util.Random;
public class Input {
    public static int[] createRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
