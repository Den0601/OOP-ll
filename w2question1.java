import java.util.*;

public class w2question1 {
    public static void main(String[] args) {
        var num = new TreeSet<>();
        var num1 = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            double a = Math.floor(Math.random() * 100 + 1);
            if (a >= 30 && a <= 70) {
                num1.add(a);
            }
            num.add(a);
            System.out.printf("第% d 個號碼:%f\n", i, a);
        }
        System.out.printf("物件內元素個數為: %d\n", num.size());
        System.out.printf("物件內元素的內容:");
        System.out.println(num);
        System.out.printf("第一個元素內容為:");
        System.out.println(num.first());
        System.out.printf("最後一個元素內容:");
        System.out.println(num.last());
        System.out.printf("內容介於30~70者:");
        System.out.println(num1);
    }

}
