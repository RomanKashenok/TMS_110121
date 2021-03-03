package com.tms;

import java.io.File;
import java.io.IOException;

public class FilesExample {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");

        System.out.println("exists: " + file.exists());
        System.out.println("isDirectory: " + file.isDirectory());

        if(!file.exists()) {
            file.createNewFile();
        } else {
            file.renameTo(new File("test2.txt"));
            file.delete();
        }

        System.out.println("exists: " + file.exists());



    }
}
