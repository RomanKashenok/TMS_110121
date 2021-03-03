package com.tms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountryReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("country.txt");

        BufferedReader bfr = new BufferedReader(fr);


        String line = bfr.readLine();

        Map<Integer, String> regions = new HashMap<>();
        regions.put(1, "South Asia");
        regions.put(2, "Eastern & Central Europe");
        regions.put(3, "Northern Africa");
        regions.put(4,"Australia, New Zealand & Polynesia");
        regions.put(5,"Mediterranean Europe");
        regions.put(6,"Central Africa");
        regions.put(7,"North America");
        regions.put(8,"Latin America");
        regions.put(9,"NIS & Russia");
        regions.put(10,"Continental Europe");
        regions.put(11,"Middle East");
        regions.put(12,"Southern Africa");
        regions.put(13,"South East Asia");
        regions.put(14,"East Africa");
        regions.put(15,"East Asia");
        regions.put(16,"North Asia");
        regions.put(17,"Scandinavia");


        int counter = 1;

        while (Objects.nonNull(line)) {

//            System.out.println("region id: " + line.substring(line.length() - 2).trim());

//            System.out.println(" country name: " + line.substring(0, line.length() -2).trim());

            System.out.println("(" + counter + ", true, '2020-08-14 05:21:00.063000', NULL, '" + line.substring(0, line.length() -2).trim() + "', " + line.substring(line.length() - 2).trim() + "),");


counter++;
            line = bfr.readLine();
        }

    }
}
