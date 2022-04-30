public class Simple_calculator {
    public static void main(String[] args) {
        int sum = add(107,23);
        int diff = sub(115,20);
        int multiple = multiply(44,5);
        int division = divide(125,5);
        int modul = modulus(100,5);
//        Simple_calculator Obj = new Simple_calculator();
//        Obj.add(107,23);
//        Obj.sub(115,20);
//        Obj.multiply(44,5);
//        Obj.divide(125,5);
//        Obj.modulus(100,5);
    }

     static int add(int input_1, int input_2) {
        int add_output = input_1 + input_2;
        System.out.println("Sum of two numbers " + add_output);
      return add_output;
    }
    static int sub(int input_1,int input_2) {
        int sub_output = input_1 - input_2;
        System.out.println("Subtraction of two numbers " + sub_output);
        return sub_output;
    }
    static int multiply(int input_1,int input_2) {
        int multiply_output = input_1 - input_2;
        System.out.println("multiplication of two numbers " + multiply_output);
        return multiply_output;
    }
    static int divide(int input_1,int input_2) {
        int divide_output = input_1 - input_2;
        System.out.println("division of two numbers " + divide_output);
        return divide_output;
    }
    static int modulus(int input_1,int input_2) {
        int modulus_output = input_1 - input_2;
        System.out.println("modulus of two numbers " + modulus_output);
        return modulus_output;
    }
}
