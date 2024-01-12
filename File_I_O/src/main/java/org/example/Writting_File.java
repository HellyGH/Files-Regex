package org.example;
import java.io.*;
public class Writting_File {
    public static void main(String[] args) {
        try {

                File file = new File("test.txt");

                if (file.createNewFile()) {
                    System.out.println("Файлът е създаден: " + file.getName());
                } else {
                    System.out.println("Файлът вече съществува.");
                }
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write("January\n");
                bw.write("February\n");
                bw.close();

            } catch (IOException error) {
                System.out.println("An error occurred.");
                error.printStackTrace();

            }


        }
    }

