public class Amstrong {
    public static void main(String[] args) {
        int number = 153;

        int result = 0;
        int values = 0;
        for (;number != 0; number /= 10)
        {
            values = number % 10;
            result += Math.pow(values,3);
        }
        if(result == number)
            System.out.println(result + " is an Armstrong number.");
        else
            System.out.println(result + " is not an Armstrong number.");
    }

}

