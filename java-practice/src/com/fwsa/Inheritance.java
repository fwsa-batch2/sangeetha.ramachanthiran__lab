package com.fwsa;

class SuperClass {
    public void vehicle(){
        System.out.println("I am a vehicle");
    }
}
class SubClass extends SuperClass{       //extends mean extending the variables or methods from super class or parent class.
    public void cars() {
        System.out.println("I am a car");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //creating object for the subclass, we can use both class variables and methods.
        // Oops..! creating object for the superclass, we can use super class variables and methods only.
        SubClass objectName = new SubClass();
        objectName.cars();
        objectName.vehicle();
    }
}
