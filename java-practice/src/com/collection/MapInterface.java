package com.collection;

import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap();
        obj.put(1,"Sangeetha");
        obj.put(1,"Chithu");
        System.out.println(obj);
        String val = obj.remove(1);
    }
}
