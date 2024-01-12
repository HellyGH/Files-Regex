package org.example;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Email {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Enter a valid email address");
        String input = scanner.nextLine();
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        var pattern= Pattern.compile(emailRegex);
        var matcher = pattern.matcher(input);
        while(matcher.matches()){
           System.out.println("Valid email address");

       }



       }


    }


