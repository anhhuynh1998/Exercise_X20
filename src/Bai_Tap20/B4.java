package Bai_Tap20;

public class B4 {
    //Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
    public static void main(String[] args) {
        int[] arr = Input.createRandomArray(10, -1, 10);
        System.out.println(checkZero(arr) ? "1" : "0");
    }

    private static boolean checkZero(int[] arr) {
        for (int num : arr) {
            if (num == 0)
                return true;
        }
        return false;
    }
}
