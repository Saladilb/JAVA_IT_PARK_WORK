package ru.itpark;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static String readNextLine(InputStream inputStream){
        return null;
    }

    

    public static void main(String[] args) {
        try {
            OutputStream outputStream =
                new FileOutputStream("output.txt");

            Rectangle a = new Rectangle("Rec1", 10, 2);
            Rectangle b = new Rectangle("Rec2", 2, 10);
            Triangle c = new Triangle("Triangle1", 5, 1, 2);
            Triangle d = new Triangle("Triangle2", 1, 1, 1);

            Figure figures[] = {a, b, c, d};

            for (int i = 0; i < figures.length; i++) {
                outputStream.write((figures[i].toString() + '\n').getBytes());
            }
            outputStream.close();

            FileInputStream fileInputStream = new FileInputStream("output.txt");
            int i=-1;
            while((i = fileInputStream.read())!= -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }


    }
}
