package com.bridgelabz.userRegistration;

import java.util.Scanner;

public class UserRegistration
{
    public static boolean patternMatching( String pattern )
    {
        return pattern.matches( "^([A-Z a-z]{8,})$" );
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word with minimum 8 characters");
        String pattern = scan.nextLine();
        System.out.println(patternMatching(pattern));
    }
}








