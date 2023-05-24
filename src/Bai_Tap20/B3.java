package Bai_Tap20;

public class B3 {
    //Bài 3: Đếm số lượng giá trị tận cùng bằng 5 trong mảng
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(countValues(arr, 5));
    }

    private static int countValues(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num % 10 == x) {
                count++;
            }
        }
        return count;
    }
}
