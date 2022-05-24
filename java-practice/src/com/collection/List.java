package com.collection;

import java.util.*;

public class List {
    public static void main(String[] args) {
        arrayListMethod();
        linkedListMethod();
        vectorMethod();
    }
    static void arrayListMethod() {
//        Duplicate values are allowed.
//        Creating objects for an arrayList.
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Rishi");
        al1.add("Master");
        System.out.println(al1.addAll(al));
//        To add the values/data into array by using add() method.
        al.add("Ramachanthiran");
        al.add("Sangeetha");
        System.out.println(al);
        // size() => To find the size of the added values.
//        System.out.println(al.size());
//        removing the data/ values by using remove() method.
//        al.remove(2);
        System.out.println(al);
        for (int i=0; i<al.size(); i++) {
//            get() => used to get the element of specified index within the list.
            System.out.println(al.get(i) + " ");
        }
    }
    static void linkedListMethod() {
        LinkedList<String> lList = new LinkedList<>();
        // To add the values.
        lList.add("Prasanna");
        lList.add("Poorani");
        lList.add("Sangee");
        lList.add("Sangee");
        System.out.println(lList);
        // To remove the value.
        System.out.println(lList.remove());
        System.out.println(lList);
        System.out.println(lList.size());
        System.out.println(lList.get(0));
        System.out.println(lList.contains("Sangee"));
        System.out.println(lList.clone());
        //Create table students(Roll_no primary key auto_increment, FirstName varchar(20) not null, LastName varchar(30) not null)
    }
    static void vectorMethod() {
//        Dynamic array.
//        Synchronized.
//        similar to arraylist.
//        Only holds objects, can't store primitive data types.
        Vector<Object> vect = new Vector<>();
        vect.add(1);
        vect.add("I ");
        vect.add("am ");
        vect.add("Vector");
        vect.add("Vector");
        System.out.println(vect);
        vect.remove(0);
        System.out.println(vect);
    }
    static void stackMethod() {
//        Stack
    }
}
