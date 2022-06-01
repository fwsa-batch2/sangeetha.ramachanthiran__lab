package com.designpattern;

public class SingletonExercise {
    private static SingletonExercise varSingle; // private static className(Datatype for variable) variableName;
    private SingletonExercise(){} // To only use within the class.
    public static SingletonExercise getInstance() {
        if (varSingle == null){ // To check whether
            varSingle = new SingletonExercise();
        }
        return varSingle;
    }
    public void marks(int a, int b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        SingletonExercise input_1 = SingletonExercise.getInstance();
        SingletonExercise input_2 = SingletonExercise.getInstance();

        input_1.marks(12, 30);
        input_2.marks(15,89);
    }
}
