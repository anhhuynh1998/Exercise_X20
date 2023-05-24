package Bai_Tap20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B8 {
    //Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(Arrays.toString(arr));
        sortPositive(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortPositive(int[] arr) {
        List<Integer> positiveList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveList.add(arr[i]);
            }
        }
        Collections.sort(positiveList);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = positiveList.get(j++);
            }
        }
    }
}
