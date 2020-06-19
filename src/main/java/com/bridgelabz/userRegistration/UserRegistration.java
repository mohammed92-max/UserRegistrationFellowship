package com.bridgelabz.userRegistration;

import java.util.Scanner;

public class UserRegistration
{
    public static boolean patternMatching( String pattern )
    {
        return pattern.matches( "^([a-z][a-z 0-9 \\ ]*[@][a-z]*[.][a-z . ]*)$" );
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the email");
        String pattern = scan.nextLine();
        System.out.println(patternMatching(pattern));
    }
}








