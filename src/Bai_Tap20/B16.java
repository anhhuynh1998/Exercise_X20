package Bai_Tap20;

import java.util.Arrays;

public class B16 {
    // tạo mảng chứa đồng hồ cát rồi tìm tổng lớn nhất của đồng hồ cát trong mảng
    public static void main(String[] args)  {
        int[][] arr =RandomHourglass.createRandomHourglass();
        print2DArray(arr);
        int maxSum = maxHourglassSum(arr);
        System.out.println(maxSum);

    }
    public static int maxHourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

