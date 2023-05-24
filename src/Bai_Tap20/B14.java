package Bai_Tap20;

import java.util.Arrays;

public class B14 {
    //Bài 14: Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(Arrays.toString(arr));
        int[] newArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == newArr[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArr[j] = arr[i];
                j++;
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = newArr[i];
        }
        return result;
    }
}
