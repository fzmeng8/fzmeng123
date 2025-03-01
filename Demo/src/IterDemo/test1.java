package IterDemo;

import java.util.*;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("aaa","asfsa","asdf","s","asfsa")
                );
        list = list
                .stream()
                .filter(str -> str.length() > 3)
                .distinct()
                .collect(Collectors.toList());
        List<Integer> collect = list.stream()
                        .map(String::length)
                        .toList();
        System.out.println(list);
        System.out.println(collect);
    }
}
