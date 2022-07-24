package com.sg.oop.userio;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    private Scanner keyboard = new Scanner(System.in);
    private int num;
    private long lNum;
    private float fNum;

    private double dNum;


    private boolean flag = true;
    @Override
    //Print a given String to the console.
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        return null;
    }
    //Display a given message String to prompt the user to enter in a String, then read in the user
    // response as a String and return that value.
    @Override
    public int readInt(String prompt) {
        System.out.println(prompt + " ");
        keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        return num;
    }

    @Override
    public int readInt(String prompt, int min, int max) {

        while(flag) {
            System.out.println(prompt + min + " and " + max);
            num = keyboard.nextInt();
            if(num >= min && num <= max)
                flag = false;
        }
        return num;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        dNum = keyboard.nextDouble();

        return dNum;
    }


    @Override
    public double readDouble(String prompt, double min, double max) {
        while(flag) {
            System.out.println(prompt + min + " and " + max);
            dNum = keyboard.nextInt();
            if(num >= min && num <= max)
                flag = false;
        }
        return dNum;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt + " ");
        keyboard = new Scanner(System.in);
        int fNum = keyboard.nextInt();
        return fNum;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        while(flag) {
            System.out.println(prompt + min + " and " + max);
            fNum = keyboard.nextInt();
            if(num >= min && num <= max)
                flag = false;
        }
        return fNum;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt + " ");
        keyboard = new Scanner(System.in);
        int lNum = keyboard.nextInt();
        return lNum;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        while(flag) {
            System.out.println(prompt + min + " and " + max);
            lNum = keyboard.nextInt();
            if(num >= min && num <= max)
                flag = false;
        }
        return lNum;
    }
}
