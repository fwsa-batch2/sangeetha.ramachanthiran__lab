package com.wrapperclass;


public class Boxing {
    public static void main(String[] args) {
        System.out.println("Hello");
        IntegerBoxing();
        UnBoxing.intUnbox();
        CharBoxing();
        UnBoxing.charUnbox();
        booleanBoxing();
        UnBoxing.boolUnbox();

    }
    public static void IntegerBoxing() {
        int a = 100;
        Integer objInt = Integer.valueOf(a);
//        Integer obj = a;
        System.out.println(objInt);
    }
    public static void CharBoxing() {
        char a = 'S';
        Character objChar = Character.valueOf(a);
//        Character obj = a;
        System.out.println(objChar);
    }
    public static void booleanBoxing() {
        boolean a = true;
        Boolean objBoolean = Boolean.valueOf(a);
//        Boolean obj = a;
        System.out.println(objBoolean);
    }
    class UnBoxing {
        public static void intUnbox() {
            Integer intObject = new Integer(200);
            int i = intObject.intValue();
            System.out.println(i);
        }
        public static void charUnbox() {
            Character charObject = new Character('A');
            char c = charObject.charValue();
            System.out.println(c);
        }
        public static void boolUnbox() {
            Boolean boolObject = new Boolean(false);
            boolean b = boolObject.booleanValue();
            System.out.println(b);
        }
    }
}

