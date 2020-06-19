package com.bridgelabz.userRegistration;

import java.util.Scanner;

public class UserRegistration
{
    public static boolean patternMatching( String pattern )
    {
        return pattern.matches( "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$" );
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word with atleast 1 numeric number");
        String pattern = scan.nextLine();
        System.out.println(patternMatching(pattern));
    }
}








