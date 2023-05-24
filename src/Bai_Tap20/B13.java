package Bai_Tap20;

import java.util.Arrays;

public class B13 {
    //Bài 13: Xóa tất cả các số chẵn trong mảng
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(Arrays.toString(arr));
        int[] newArr = removeEvenNumbers(arr);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] removeEvenNumbers(int[] arr) {
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[count] = arr[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = newArr[i];
        }
        return newArr;
    }
}
