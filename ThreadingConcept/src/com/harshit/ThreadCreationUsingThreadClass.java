package com.harshit;
public class ThreadCreationUsingThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Inside run method");

    }

    public static void main(String[] args) {

        ThreadCreationUsingThreadClass obj = new ThreadCreationUsingThreadClass();
        obj.start();
    }

}
