package Bai_Tap20;

import java.util.Arrays;

public class B9 {
    //Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(Arrays.toString(arr));
        sortOddNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortOddNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    continue;
                }
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
