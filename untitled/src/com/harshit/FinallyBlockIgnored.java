package com.harshit;

public class FinallyBlockIgnored {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            System.exit(1);
        }
        finally
        {
            System.out.println("Will finally be called?");
        }
    }
}
