package org.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
       /* var pattern = Pattern.compile("Hello",Pattern.CASE_INSENSITIVE);
        var matcher = pattern.matcher("Hello World");
        boolean matchFound= matcher.find();
        if(matchFound){
            System.out.println("Found!");
        }else {
            System.out.println("Not found!");
        }*\
        */
        var pattern=Pattern.compile("[a-c]");
        var matcher = pattern.matcher("bravo");

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}