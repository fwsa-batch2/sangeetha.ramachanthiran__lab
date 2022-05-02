
public class SortTheArray {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[] {14,22,23,16,27};
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j =i+1; j < arrayNumbers.length; j++) {
                int num = 0;
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    num = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = num;
                }
            }
            System.out.println(arrayNumbers[i]);
        }
    }
}
