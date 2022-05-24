package com.fwsa;

interface Shop {
    void price();
    void quantity();
}
 class Fruits implements Shop{
    public void price() {
        System.out.println("Rs.200");
    }
    public void quantity(){
        System.out.println("2kg");
    }
}
class Vegetables implements Shop{
    public void price() {
        System.out.println("Rs.150");
    }
    public void quantity(){
        System.out.println("3kg");
    }

}
public class Interface {
    public static void main(String[] args) {
        Fruits fruitsObj = new Fruits();
        fruitsObj.price();
        fruitsObj.quantity();
        Vegetables vegObj = new Vegetables();
        vegObj.quantity();
        vegObj.price();
    }
}
