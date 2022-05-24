public class NonArgConstructor {
    int input;
    NonArgConstructor() {
        input = 15;

    }
    public static void main(String[] args) {
        NonArgConstructor objectName = new NonArgConstructor();
        System.out.println(objectName.input);
    }
}
