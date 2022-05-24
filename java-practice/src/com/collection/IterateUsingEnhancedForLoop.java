package com.collection;
import java.lang.reflect.Array;
import java.util.*;

public class IterateUsingEnhancedForLoop {
    public static void main (String[] args) {

        // create a list
        ArrayList<String> list = new ArrayList<>();

        // add elements
        list.add("Sangeetha");
        list.add("Poorani");
        list.add("VP");

        // Iterate through the list
        System.out.println( list.iterator());
//        for( String element : list ){
//            System.out.println( element );
//        }
    }
}
