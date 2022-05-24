public class StrongNumber {
    public static void main(String[] args) {
        int input= 153;
        int factorial = 1;
        int result = 0;
        for ( ;input > 0;input=input/10) {
            int divide = input % 10;
            for (int i=divide; i > 1 ; i--) {
                factorial *= i;
            }
//            System.out.println(factorial);
            result += factorial;
            factorial = 1;
        }

        System.out.println(result);
        System.out.println(input);
        if (input == result) {
            System.out.println(input + " is a strong number");
        }
        else{
            System.out.println(input + " is not a strong number");
        }
    }
}
