package org.example;

import java.io.*;
import java.util.Scanner;

public class Date_Validation {
    public static void main(String[] args) {
        String filename;
        System.out.println("Enter the file name:");
        try (var scn = new Scanner(System.in)) {
            filename = scn.nextLine();
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String date;
            System.out.println("Enter four dates:");
            for (int i = 0; i < 4; i++) {
                date = scn.nextLine();
                bw.write(date + "\n");
            }
            bw.close();

            String strPattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            System.out.println("Validation results:");
            while ((s = br.readLine()) != null) {
                System.out.println(s + " => " + s.matches(strPattern));
            }
        } catch (IOException error) {
            System.out.println("An error occurred");
            error.printStackTrace();
        }
    }
}
