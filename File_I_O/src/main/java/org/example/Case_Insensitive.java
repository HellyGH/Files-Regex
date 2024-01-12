package org.example;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Case_Insensitive {
    public static void main(String[] args){
        var scanner=new Scanner(System.in);
        System.out.println("Enter input data");
        String input = scanner.nextLine();
        System.out.println("Enter required char");
        char ch=scanner.next().toCharArray()[0];

        var pattern = Pattern.compile("["+ch+"]",Pattern.CASE_INSENSITIVE);
        var matcher = pattern.matcher(input);
        int count=0;
        while (matcher.find()){
            count+=1;

        }
        System.out.println("The letter "+ch+" occurred "+count+" times in the given text (irrespective of case)");




    }

}
