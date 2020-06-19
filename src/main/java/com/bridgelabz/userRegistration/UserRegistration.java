package com.bridgelabz.userRegistration;

import java.util.Scanner;

public class UserRegistration
{
    public static boolean patternMatching( String pattern )
    {
        return pattern.matches( "^([A-Z]{1}[a-z]{2,})$" );
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the last name");
        String pattern = scan.nextLine();
        System.out.println(patternMatching(pattern));
    }
}








