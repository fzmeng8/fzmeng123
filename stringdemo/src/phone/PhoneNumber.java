package phone;

public class PhoneNumber {
    public static void main(String[] args) {
        String phonenumber = "15209858335";
        String start = phonenumber.substring(0, 3);
        String end = phonenumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
