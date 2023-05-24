package Bai_Tap20;

import java.util.Arrays;

public class B12 {
    //Bài 12: Xóa tất cả các số âm trong mảng
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -5, 10);
        System.out.println(Arrays.toString(arr));
        int[] newArr = removeNegativeNumbers(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] removeNegativeNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[count] = arr[i];
                count++;
            }
        }
        return newArr;
    }
}
