package com.strings;

public class Strings {
    //Definition : Represent the sequence of char values.
    public static void main(String[] args) {
        String stringName = "Welcome";
        System.out.println("String " + stringName);
        char[] characters = {'W','E','L','C','O','M','E'};
        System.out.println(characters);
        // To combine a string, use concat !
        concating();
        // To split the sentences into words !
        splitting();
        // To find a length of the String !
        stringLength();
        stringOfSubString();
    }
     static void concating() {
      String myString = "I am concat method";
         System.out.println(myString);
         System.out.println(myString.concat(" in String"));
     }
     static void splitting() {
        String splitString = "Learn a split method by splitting this line";
        String[] listTheWord = splitString.split(" ",8);
         for (String a : listTheWord)
            System.out.println(a);
     }
     static void stringLength() {
        // It calculates with a space.
        String lengthOfString = "Find my Length";
         System.out.println(lengthOfString.length());
     }
     static void stringOfSubString() {
        String sub = "I am a Substring pick me out";
         System.out.println(sub.substring(7,16));
     }
}
