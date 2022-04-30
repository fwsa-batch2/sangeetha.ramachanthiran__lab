package com.fwsa;

abstract class Vehicle{
    abstract void speed();
    abstract void wheels();
}
class Car extends Vehicle{
    void speed() {
        System.out.println("150km/hr");
    }
    void wheels() {
        System.out.println("");
    }
}
class Bike {

}
public class Abstraction {
}
