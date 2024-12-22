package stringbuilderDEMO;
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int len = sb.length();
        System.out.println(len);

        String str = sb.toString();
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();

        String str2 = new StringBuilder().append(str1).reverse().toString();

        if (str1.equals(str2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }


        int[] arr = {1,2,3};
        String str3 =  arrayToString(arr);
        System.out.println(str3);

    }
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
