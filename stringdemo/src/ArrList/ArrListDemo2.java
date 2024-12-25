package ArrList;

import java.util.ArrayList;

public class ArrListDemo2 {
    public static int isContains(ArrayList<User> lists, String id) {
        for (User user : lists) {
            if(user.getId().equals(id)){
                return lists.indexOf(user);
            };
        }
        return -1;
    }


    public static void main(String[] args) {
        ArrayList<User> lists = new ArrayList<>();
        User u1 = new User("001","alpha","123");
        User u2 = new User("002","beta","456");
        User u3 = new User("003","gamma","789");

        lists.add(u1);
        lists.add(u2);
        lists.add(u3);

        int index = isContains(lists, "002");
        System.out.println(index);
    }
}
