package Bai_Tap20;

import java.util.Arrays;

import static com.sun.javafx.geom.Path2D.contains;

public class B6 {
    //Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
    public static void main(String[] args) {
        int[] a = Input.createRandomArray(5, -1, 10);
        System.out.println(Arrays.toString(a));
        int[] b = Input.createRandomArray(10, -1, 10);
        System.out.println(Arrays.toString(b));
        if (isSubset(a, b)) {
            System.out.println("Tất cả các phần tử trong mảng a đều nằm trong mảng b");
        } else {
            System.out.println("Các phần tử trong mảng a không nằm trong mảng b ");
        }
    }

    public static boolean isSubset(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
