package com.bridgelabz.userRegistration;

import java.util.Scanner;

public class UserRegistration
{
    public static boolean patternMatching( String pattern )
    {
        return pattern.matches( "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$" );
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word with which has exactly 1 special character");
        String pattern = scan.nextLine();
        System.out.println(patternMatching(pattern));
    }
}








