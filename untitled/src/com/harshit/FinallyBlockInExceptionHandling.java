package com.harshit;

public class FinallyBlockInExceptionHandling {
    public void methodWithError()
    {
        try{
            int i = 10/0;
            System.out.println("Inside try block");
        }
        catch(Exception e)
        {
            System.out.println("Inside Catch Block");
            System.out.println(e);
        }
        finally
        {
            System.out.println("Inside finally block");
        }
    }

    public void methodWithoutError()
    {
        try{
            int i = 10;
            System.out.println("Inside try block");
        }
        catch(Exception e)
        {
            System.out.println("Inside Catch Block");
            System.out.println(e);
        }
        finally
        {
            System.out.println("Inside finally block");
        }
    }
    public static void main(String[] args) {
        FinallyBlockInExceptionHandling obj = new FinallyBlockInExceptionHandling();
        System.out.println("1) Method with Error called: \n");
        obj.methodWithError();

        System.out.println("\n\n2) Method without Error called: \n");
        obj.methodWithoutError();
    }
}
