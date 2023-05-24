package Bai_Tap20;

import java.util.Arrays;

public class B7 {
    //Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        moveZerosToFront(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToFront(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }
}
