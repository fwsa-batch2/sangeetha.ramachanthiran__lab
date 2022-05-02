public class Calculator {
    static int input1 = 30;
    static int input2 = 15;
    public static void main(String[] args) {
        System.out.println("Operator");
        add();
        sub();
        multiply();
        divide();
        modulus();
    }
    static void add() {
     int add_output = input1 + input2;
        System.out.println("The addition the two numbers is " + add_output);
    }
    static void sub() {
        int sub_output = input1 - input2;
        System.out.println("The subtraction the two numbers is " + sub_output);
    }
    static void multiply() {
        int multiply_output = input1 * input2;
        System.out.println("The multiplication the two numbers is " + multiply_output);
    }
    static void divide() {
        int divide_output = input1 / input2;
        System.out.println("The division the two numbers is " + divide_output);
    }
    static void modulus() {
        int modulus_output = input1 % input2;
        System.out.println("The modulus of the number is " + modulus_output);
    }
}
