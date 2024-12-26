package ArrList;

import java.util.ArrayList;

public class ArrListDemo3 {
    public static void rePrice(ArrayList<Phone> arr) {
        for (Phone phone : arr) {
            if (phone.getPrice() < 3000) {
                System.out.println(phone.getBrand() + " " + phone.getPrice());
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Phone> Phones = new ArrayList<>();
        Phone p1 = new Phone("xiaomi",1000);
        Phone p2 = new Phone("apple",8000);
        Phone p3 = new Phone("chuizi",2999);

        Phones.add(p1);
        Phones.add(p2);
        Phones.add(p3);

        rePrice(Phones);
    }
}
