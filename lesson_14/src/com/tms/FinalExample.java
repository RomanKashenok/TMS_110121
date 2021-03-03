package com.tms;

import java.io.*;

public class FinalExample {
    public static void main(String[] args) {

        File file = new File("D:/avatar.jpg");
        if(file.exists()) {

            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream("my_new_avatar.jpg")) {

                int availableBytesSize = fis.available();
                byte[] bytesToCopy = new byte[availableBytesSize];

                for (int i = 0; i < bytesToCopy.length; i++) {
                    bytesToCopy[i] = (byte) fis.read();
                }

                for (int i = 0; i < bytesToCopy.length; i++) {
                    fos.write(bytesToCopy[i]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }
}
