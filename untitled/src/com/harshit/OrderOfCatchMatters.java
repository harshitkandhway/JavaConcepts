package com.harshit;

public class OrderOfCatchMatters {
    public void parentsCatchCalledFirst()
    {
        try {
            int i = 5 % 0;
            System.out.println(i);
        }
        catch(Exception e) {
            System.out.println("Exception called");
        }
        /**
         * This throws a compile time exception saying "ArithmeticException has already been caught."
         * So to run the code this section should be commented out.
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception Called.");
        }
         **/
    }

    public void parentsCatchCalledSecond()
    {
        try {
            int i = 5 % 0;
            System.out.println(i);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception Called.");
        }
        catch(Exception e) {
            System.out.println("Exception called");
        }
    }


    public static void main(String[] args) {
        OrderOfCatchMatters obj = new OrderOfCatchMatters();
        obj.parentsCatchCalledFirst();
        obj.parentsCatchCalledSecond();

    }
}
