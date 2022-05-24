package test;

public class NameReversing {
    public static void main(String[] args) {
//        StringBuffer name = new StringBuffer("Sangeetha");
//        System.out.println(name);
//        name.reverse();
//        System.out.println(name);
        String name = "Sangeetha";
        for (int i=name.length()-1; i>=0; i--) {
            System.out.print(name.charAt(i));
        }
    }

}
