package com.fwsa;

class Class1 {
    int input1 = 14;
    int input2 = 16;

    int add() {
        return input1 + input2;
    }

}
class Class2 extends Class1{
    int input1 = 9;
    int input2 = 7;
    int add() {

        return input1 + input2;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Class1 objName = new Class1();
        System.out.println(objName.add());
        Class2 classObj = new Class2();
        System.out.println(classObj.add());
    }
}



