package com.sg.oop.stateCapital1;

import java.util.HashMap;
import java.util.Map;

public class StateCapitals {
    public static void main(String[] args){
        // HashMap to store the states and their capitals
        Map<String, String> statesAndCapitals = new HashMap<>();

        // using put method to add key value pair to the hashMap
        statesAndCapitals.put("Alabama", "Montgomery");
        statesAndCapitals.put("Alaska", "Juneau");
        statesAndCapitals.put("Arizona", "Phoenix");
        statesAndCapitals.put("Arkansas", " Little Rock");
        statesAndCapitals.put("California", "Sacramento");
        statesAndCapitals.put("Colorado", "Denver");
        statesAndCapitals.put("Connecticut", "Hartford");
        statesAndCapitals.put("Delaware", "Dover");
        statesAndCapitals.put("Florida", "Tallahassee");


        // using keySet() for iteration over keys (state)
        System.out.println("States:");
        System.out.println("=======");
        for (String state : statesAndCapitals.keySet()) // enhanced for loop
            System.out.println(state);

        // using values() for iteration over values (capitals)
        System.out.println("\nCapitals:");
        System.out.println("=======");
        for (String capital : statesAndCapitals.values())
            System.out.println(capital);


        System.out.println("\nSTATE/CAPITAL PAIRS:");
        System.out.println("=====================");
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : statesAndCapitals.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());

    }
}
