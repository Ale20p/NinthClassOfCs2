package org.example;

import java.io.FileOutputStream;

public class FileOutputSteamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testoout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
