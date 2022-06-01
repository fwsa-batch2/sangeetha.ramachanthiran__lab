package test;

import java.util.*;
import java.io.*;

//3
//uncle sam
//99912222
//tom
//11122222
//harry
//12299933
//uncle sam
//uncle tom
//harry

class MapInterfaceHR{
    public static void main(String []argh)
    {
        Map<String,String> obj = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=1;i<=n;i++)
        {
            String name=in.nextLine();
            String phone=in.nextLine();
//            in.nextLine();
            obj.put(name,phone);
        }
        while(in.hasNext()){
            String findNum = in.nextLine();
            if (obj.containsKey(findNum)){
                System.out.println(findNum + "=" + obj.get(findNum));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}

