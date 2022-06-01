package test;
import java.util.*;

public class HashSetHR {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
//            System.out.println(t);
            String[] left = new String[t]; // giving t size into string array named left
            String[] right = new String[t]; // giving t size into string array named left

            for (int i = 0; i < t; i++) {
                left[i] = s.next();
                right[i] = s.next();
            }
            HashSet<String> myhash = new HashSet<String>();
            for (int i = 0; i < t; i++) {
                myhash.add(left[i]+" "+right[i]);
                System.out.println(myhash.size());
            }
            //Write your code here
        }
    }

