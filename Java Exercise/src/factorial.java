public class factorial {
    public static void main (String[] args) {
        int input = 5;
        if (input < 0) {
            System.out.println("Negative numbers does not exist");
        }
        else if(input == 0) {
            System.out.println("The factorial of 0 is 1");
        }
        else{
            int factorial = 1;
            for (int i=1; i<= input; i++) {
                factorial *= i;
            }
            System.out.println("The value of the number " + input + " is " + factorial);
        }
    }
}
