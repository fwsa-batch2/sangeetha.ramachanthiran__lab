package com.fwsa;

//Access Modifier
// Used to set the accessibility of classes, interfaces, variables, methods, constructors.
public class EmployeeDetails {
    // Declarations are visible or used everywhere
    public static String employeeName = "Sangeetha";
    // Declarations are visible or used only within the package (package private)
    static int age = 18;
    // Declarations are visible or used within the package or all subclasses
    protected static int salary = 20000;
    // Declarations are visible or used within the class only
    private static char grade = 'A';

    public static void main(String[] args) {
        System.out.println("Hello");
        Employee.printing();
        EmpDetails.nonSubPrint();
    }
}
class Employee extends EmployeeDetails {
    static void printing() {
        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(salary);
//        System.out.println(grade);
    }
}
class EmpDetails {
    static void nonSubPrint() {
//        System.out.println(employeeName);
//        System.out.println(age);
//        System.out.println(salary);
//        System.out.println(grade);
    }
}

