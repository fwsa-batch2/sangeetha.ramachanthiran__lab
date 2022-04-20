public class primeNumber {
    public static void main(String[] args) {
        int number = 12;
        boolean prime = true;
        if (number == 1) {
            System.out.println("This 1 is consider neither prime nor composite");
        }

        else if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;

                }
            }
            if (prime) {
                System.out.println(number+ " is a prime number.");
            }
            else {
                System.out.println(number + " is not a prime number.");

            }
        }
    }
}
