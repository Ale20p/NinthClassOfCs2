package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            processfile("sample.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found" + e);
        } catch (IOException ex) {
            System.out.println("IOException" + ex);
        }
    }

    private static void processfile(String filename) throws FileNotFoundException, IOException {
        if (filename == null || filename.isEmpty()) {
            throw new FileNotFoundException("file name is empty or null");
        }
        // now initialize IOException during the file processing after the opening the file
        if (filename.equals("example.txt")) {
            throw new IOException("IOException occurred during processing the file ");
        }
        //
        if (filename.length() > 20) {
            throw new IllegalArgumentException("File name is too long to read for this process");
        }
        System.out.println("Processing file " +filename);
    }
}
