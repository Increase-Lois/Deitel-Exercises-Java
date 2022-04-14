package PraciceCodes;

import java.util.ArrayList;
import java.util.List;

public class ArraylistWithFemi {
    private static final List<String> names = new ArrayList<>();
    public static void main(String[] args) {

        names.add("hello");
        names.add("hello");
        names.add("hello");
        names.add("hello");
        //add increase to arraylist at index 3
        names.add(3, "increase");
        System.out.println(names.get(3));
        for (String name:names) {
            System.out.println("name----> " + name);
        }
        names.remove("increase");
        System.out.println("after removing increase from list");
                for (String name:names) {

            System.out.println("name ----> " + name);
        }
        System.out.println(names.contains("femi"));
                if (names.contains("hello")){
                    names.remove("hello");
                }
        for (String name:names) {
            System.out.println("name after removing hello----> " + name);
        }
        System.out.println("size---->" + names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        for (int i=0;i<=names.size();i++) {
            if (names.get(i).equals("hello")){
                System.out.println("index in loop---->"+ i);
                System.out.println(names.remove(i));
            }
        }

        for (String name:names) {
            System.out.println("name ----> " + name);
        }

        System.out.println(names.isEmpty());
    }
}
