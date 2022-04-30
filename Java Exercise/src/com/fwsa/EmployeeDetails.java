package com.fwsa;

public class EmployeeDetails {
    public static String employeeName = "Sangeetha";
    static int age = 18;
    protected static int salary = 20000;
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

