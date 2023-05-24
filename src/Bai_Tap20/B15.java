package Bai_Tap20;

import java.util.Arrays;

public class B15 {
    //Bài 15: Hãy đưa tất cả các số 1 về đầu mảng
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -2, 5);
        System.out.println(Arrays.toString(arr));
        moveOnesToFront(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void moveOnesToFront(int[] arr) {
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                newArr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                newArr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }

}
