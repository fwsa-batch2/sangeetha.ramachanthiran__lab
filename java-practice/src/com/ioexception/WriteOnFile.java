package com.ioexception;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {
    public static void main(String[] args) throws IOException {
        FileWriter writeSomething = new FileWriter("\\Home\\tech\\myFile.txt");
        writeSomething.write("Happy Learning");
        writeSomething.close();
        System.out.println("Successfully written");
    }
}
