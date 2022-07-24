package com.sg.oop.statecapitals2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitals2 {
    public static void main(String[] args){

        Map<String, String> stAndCaps = new HashMap<>();
        Scanner scan = null;

        try{
            scan = new Scanner(new FileInputStream("StateCapitals.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }

        while(scan.hasNext()){
            String str = scan.nextLine();
            //System.out.println(scan.nextLine());
            // split the line by :
            String[] parts = str.split(":");

            // first part is key, second is value
            String ky = parts[0].trim();
            String vlu = parts[1].trim();

            // put name, number in HashMap
            stAndCaps.put(ky, vlu);

        }
        System.out.println("Theer are  " + stAndCaps.size() + " stored in my app");
    }
}
