package test;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int factor = 1;
        int output = 0;
        for(; num !=0; num/=10) {
            int remain = num % 10;
//            System.out.println(remain);
            for (int i = remain; i > 1 ; i--) {
                factor *= i;
//                System.out.println(factor);
            }
            output += factor;
            factor = 1;
        }
        System.out.println(output);
        System.out.println(temp);
        if (output == temp ) {
            System.out.println(temp + "is a strong number");
        }
        else {
            System.out.println(temp + "is not strong number");
        }
    }
}
