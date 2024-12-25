package ArrList;
import java.util.ArrayList;
public class ArrListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // 删除第四个元素
        sites.remove("Google");
        sites.set(1, "Apple");
        sites.get(1);
        System.out.println(sites);
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }

        for (String i : sites) {
            System.out.println(i);
        }
    }
}
