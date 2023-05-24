package Bai_Tap20;

public class B17 {
    //Cho 1 số nguyên ,N,in đầu tiên của nó 10 bội số.Mỗi bội số N x i( trong đó : 1<= i <=10)phải được in trên một dòng mới ở dạng: N x i = kết quả.
    public static void main(String[] args) {
        int N = 4;
        printMultiples(N);

    }
    private static void printMultiples(int N){
        for (int i = 1; i < 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
