import java.util.*;

public class w2question2 {
    public static void main(String[] args) {
        var month = new HashMap<>();
        System.out.println("請輸入1~12");
        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        month.put("1", "January");
        month.put("2", "February");
        month.put("3", "March");
        month.put("4", "April");
        month.put("5", "May");
        month.put("6", "June");
        month.put("7", "July");
        month.put("8", "Augest");
        month.put("9", "September");
        month.put("10", "October");
        month.put("11", "November");
        month.put("12", "December");
        while (month.containsKey(i) == false) {

            System.out.println("範圍錯誤");
            System.out.println("請輸入1~12");

            String e = input.nextLine();
            if (month.containsKey(i) == true || month.containsKey(e) == true) {
                i = e;
                break;
            }
        }
        if (month.containsKey(i) == true) {
            System.out.printf("第%s月的英文單字為 ", i);
            System.out.println(month.get(i));
        }
        input.close();

    }
}
