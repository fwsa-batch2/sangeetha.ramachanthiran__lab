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
        System.out.println("four-wheeler");
    }
}
class Bike extends Vehicle{
  void speed() {
      System.out.println("120km/hr");
  }
  void wheels() {
      System.out.println("two-wheeler");
  }
}
public class Abstraction {
    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.speed();
        carObj.wheels();
    }
}
