import java.sql.SQLOutput;

public class Fibonacci {
    public static void main(String[] args) {
        int no_of_terms = 5;
        int num_1 = 0;
        int num_2 = 1;
        int next_num;
        for (int i=1; i<=no_of_terms; i++) {
            next_num = num_1 + num_2;
            num_1 = num_2;
            num_2 = next_num;
            System.out.println("Fibonacci Series " + num_1);
        }
    }
}
