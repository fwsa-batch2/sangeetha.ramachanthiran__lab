package com.collection;
import java.util.*;
import java.lang.*;

public class SetInterface {
    public static void main(String[] args) {
     setMethod();
    }
    static void setMethod() {
        // Duplicate values not allowed.
        // Ordered is not maintained.

        Set<String> set_hash = new HashSet<>();
        set_hash.add("Hello");
        set_hash.add("Welcome");
        set_hash.add("Interface");
        set_hash.add("Set");
        System.out.println(set_hash);

//        set_hash.addAll(Arrays.asList(new Integer[] {1,12,13,22}));
    }
}
