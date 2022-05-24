package com.ioexception;
import java.io.*;


public class CreateFile {
    public static void main(String[] args) throws IOException {
        File fileObj = new File("\\Home\\tech\\myFile.txt");
        if (fileObj.createNewFile()){
            System.out.println("Created");
        }
        else{
            System.out.println("Exists");
        }
        System.out.println(fileObj.exists());

    }
}
