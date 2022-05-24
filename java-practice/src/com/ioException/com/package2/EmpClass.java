package com.package2;
import com.fwsa.EmployeeDetails;

import static com.fwsa.EmployeeDetails.*;

public class EmpClass {
    public static void main(String[] args) {
//        System.out.println(employeeName);
//        System.out.println(age);
//        System.out.println(salary);
//        System.out.println(grade);
        Emp.method1();
        SubClass.sub();
        NonSubClass.nonSub();
    }
}
class Emp extends EmployeeDetails {
     static void method1() {
        System.out.println(employeeName);
//        System.out.println(age);
        System.out.println(salary);
//        System.out.println(grade);
    }
}
class SubClass extends EmpClass {
    public static void sub() {
        System.out.println(employeeName);
//        System.out.println(age);
//        System.out.println(salary);
//        System.out.println(grade);
    }
}
class NonSubClass {
    public static void nonSub() {
        System.out.println(employeeName);
//        System.out.println(age);
//        System.out.println(salary);
//        System.out.println(grade);
    }
}

