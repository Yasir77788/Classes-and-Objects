package com.sg.oop.statecapitals3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class StateCapitalsApp {
    public static void main(String[] args){

        Capital capObj = new Capital();

        Map<String, Capital> stAndCaps = new HashMap<>();


        Scanner scan = null;

        try{
            scan = new Scanner(new FileInputStream("MoreStateCapitals.txt"));
            //scan.useDelimiter("\\::");
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
        while(scan.hasNextLine()){
            String line = scan.nextLine();

            String [] items = line.split("::"); // RegEx delimiter
//            System.out.println(items[0]);
//            System.out.println(items[1]);
//            System.out.println(items[2]);
//            System.out.println(items[3]);

            Capital capObjX = new Capital(items[1], Integer.parseInt(items[2]),Double.parseDouble(items[3]));


            stAndCaps.put(items[0], capObjX);

        }

        System.out.println(stAndCaps.size() + " STATE/CAPITAL PAIRS LOADED.");

        System.out.println("=====================");
        // using for-each loop for iteration over Map.entrySet()
//        for (Map.Entry<String,List<Capital>> entry : stAndCaps.entrySet())
//            System.out.println(entry.getKey() + " : " + entry.getValue().
//                    " Pop: " + entry.getValue().getPopulation() + " Area: " + entry.getValue().getMileage());


        Iterator <String> it = stAndCaps.keySet().iterator();

        while(it.hasNext())
        {
            String state = it.next();
            Capital cap = stAndCaps.get(state);
            System.out.println(state + " - " + cap.getCapitalNames() + " | " + " Pop " +
                    cap.getPopulation() + " | " + " Area " + cap.getMileage() + " sq mi");
        }

        System.out.println("Please enter the lower limit for capital city population: ");
        Scanner input = new Scanner(System.in);
        int limit = Integer.parseInt(input.nextLine());

        System.out.println("\nLISTING CAPITALS WITH POPULATIONS GREATER THAN " + limit);
        Iterator <String> it2 = stAndCaps.keySet().iterator();
        while(it2.hasNext())
        {
            String state = it2.next();
            Capital cap = stAndCaps.get(state);
            if(cap.getPopulation() > limit) {
                System.out.println(state + " - " + cap.getCapitalNames() + " | " + " Pop " +
                        cap.getPopulation() + " | " + " Area " + cap.getMileage() + " sq mi");
            }
        }

        System.out.println("\nPlease enter the upper limit for capital city sq mileage: ");
        int upper  = Integer.parseInt(input.nextLine());
        System.out.println("LISTING CAPITALS WITH AREAS LESS THAN: " + upper);

        Iterator <String> it3 = stAndCaps.keySet().iterator();
        while(it3.hasNext())
        {
            String state = it3.next();
            Capital cap = stAndCaps.get(state);
            if(cap.getPopulation() < limit) {
                System.out.println(state + " - " + cap.getCapitalNames() + " | " + " Pop " +
                        cap.getPopulation() + " | " + " Area " + cap.getMileage() + " sq mi");
            }
        }



    }


}

