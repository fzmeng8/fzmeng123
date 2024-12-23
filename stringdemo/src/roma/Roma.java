package roma;
import java.util.Scanner;
public class Roma {
    public static boolean isNumeric(String str) {
        if (str == null || str.length() != 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }


    public static void arabToRoman(String str) {
        char[] RomanArr = {' ','Ⅰ','Ⅱ','Ⅲ','Ⅳ','Ⅴ','Ⅵ','Ⅶ','Ⅷ','Ⅸ'};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - '0';
            roman.append(RomanArr[num]);
        }
        System.out.println(roman);
    }







    public static void main(String[] args) {
//      键盘录入
        System.out.println("input a 9 wei number: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        boolean isNum = isNumeric(str);
        if (isNum) {
            System.out.println(str + " is a number.");
        } else {
            System.out.println(str + " is not a number.");
        }

        arabToRoman(str);


    }
}
