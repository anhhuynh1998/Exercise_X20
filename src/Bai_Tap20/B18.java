package Bai_Tap20;

public class B18 {
    //Cho một chuỗi, s, và hai chỉ số, start và end , in ra một chuỗi con bao gồm tất cả các ký tự trong phạm vi bao gồm từ đến .
    // Bạn sẽ thấy phương thức chuỗi con của lớp Chuỗi hữu ích trong việc hoàn thành thử thách này.
    public static void main(String[] args) {
        String s = "hello world";
        int start = 3;
        int end = 7;
        String sub = getSubstring(s, start, end);
        System.out.println(sub);
    }

    public static String getSubstring(String s, int start, int end) {
        return s.substring(start, end + 1);
    }
}
