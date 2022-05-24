public class PerfectNumbers {
    public static void main(String[] args) {
        int number = 28;
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result+=i;
            }
        }
        if(number==result) {
            System.out.println(number+" is a perfect number");
        }
        else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
