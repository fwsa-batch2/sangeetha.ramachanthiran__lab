package test;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.*;
import java.util.*;
    public class ListHR {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            List<Integer> ls = new ArrayList<>(size);;
            for (int i = 1; i <= size; i++) {
                ls.add(sc.nextInt());
            }
            int times = sc.nextInt();
            for (int i = 0; i < times; i++) {
                String str = sc.next();
                if (str.equals("Insert")) {
                    ls.add(sc.nextInt(), sc.nextInt());
                } else {
                    ls.remove(sc.nextInt());
                }
            }
            sc.close();
            for (Integer num : ls) {
                System.out.print(num + " ");
            }
        }
    }

