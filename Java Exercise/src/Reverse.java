public class Reverse {
    public static void main(String[] args) {
        int number = 1567,last_digit = 0;
        for ( ;number != 0;number=number/10) {
            int divide = number%10;
            last_digit = (last_digit * 10) + divide;
        }
        System.out.println("The reverse number of the digits " + last_digit);
    }
}
