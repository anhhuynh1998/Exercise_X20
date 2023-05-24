package Bai_Tap20;

public class B5 {
    //Bài 5: Kiểm tra mảng có giảm dần hay không
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(checkDecreasing(arr) ? "1" : "0");
    }

    private static boolean checkDecreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
