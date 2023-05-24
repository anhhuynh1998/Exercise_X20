package Bai_Tap20;

import java.util.Arrays;

public class B11 {
    // Bài 11: Thêm x vào trong mảng tăng nhưng vẫn giữ nguyên tính tăng của mảng
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(Arrays.toString(arr));
        int x = 7;
        int[] newArr = insertElement(arr, x);
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] insertElement(int[] arr, int x) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        int i = 0, j = 0;
        while (i < n && arr[i] < x) {
            newArr[j++] = arr[i++];
        }
        newArr[j++] = x;
        while (i < n) {
            newArr[j++] = arr[i++];
        }
        return newArr;
    }
}
