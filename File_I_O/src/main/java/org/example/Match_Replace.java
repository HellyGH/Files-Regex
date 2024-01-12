package org.example;

import java.io.*;
import java.util.regex.*;
/*програма, която чете файл и замества всички срещания на определен текст
с друг текст, използвайки регулярни изрази.
*/
public class Match_Replace {
    public String replaceWithPattern(String str, String replace) {
        Pattern ptn = Pattern.compile("winter");
        Matcher mtch = ptn.matcher(str);
        return mtch.replaceAll(replace);
    }
    public static void main(String a[]) {

        try {
            File file = new File("file.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("The season is winter!");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String s;
            while ((s = br.readLine()) != null) {
                content.append(s).append("\n");
            }
            br.close();

            String str = content.toString();
            Match_Replace matchReplace = new Match_Replace();
            String updatedContent = matchReplace.replaceWithPattern(str, "summer");

            // Write the updated content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(updatedContent);
            writer.close();

            System.out.println("Original content:");
            System.out.println(str);
            System.out.println("Updated content:");
            System.out.println(updatedContent);

        } catch (IOException error) {
            System.out.println("An error occurred");
            error.printStackTrace();
        }
    }


}
