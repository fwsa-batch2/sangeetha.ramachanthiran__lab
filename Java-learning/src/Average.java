public class Average {
    public static void main(String[] args) {
        int inputs[] = {1, 2, 3, 4, 5,6};
        int sum = 0;
        int value_no = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i];
            System.out.println(sum);
        }
        float result = (float)sum / inputs.length;
        System.out.println(result);
    }
}
