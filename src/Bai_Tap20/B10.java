package Bai_Tap20;

import java.util.Arrays;

public class B10 {
    //Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(Arrays.toString(arr));
        int k = 6;
        int x = 9;
        int[] newArr = insertElement(arr, x, k);
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] insertElement(int[] arr, int x, int k) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];
        }
        newArr[k] = x;
        for (int i = k + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

}
