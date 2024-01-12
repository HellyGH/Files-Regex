package org.example;
import java.io.*;

public class Reading_File {
    public static void main(String[] args){
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("/Users/hellsbells/IdeaProjects/File_I_O/test-copy.txt"));
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/hellsbells/IdeaProjects/File_I_O/test.txt"));
            String s;
            while((s= br.readLine()) != null){
                bw.write(s + "\n");
            }
            br.close();
            bw.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }
}
