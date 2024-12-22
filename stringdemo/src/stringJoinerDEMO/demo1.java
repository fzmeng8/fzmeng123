package stringJoinerDEMO;

import java.util.StringJoiner;

public class demo1 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("---");
        joiner.add("aaaa").add("bbbb").add("cccc").add("dddd");
        System.out.println(joiner);

        StringJoiner joiner2 = new StringJoiner(", ","[","]");
        joiner2.add("aaa").add("bbbb").add("cccc").add("dddd");
        System.out.println(joiner2);
    }
}
