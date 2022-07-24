package com.sg.oop.statecapitals3;



public class Capital {

    private String capitalNames;

    public Capital(String capitalNames, int population, double mileage) {
        this.capitalNames = capitalNames;
        this.population = population;
        this.mileage = mileage;
    }

    private int population;
    private double mileage;

    public Capital() {
        capitalNames = null;
        this.population = 0;
        this.mileage = 0;
    }



    public String getCapitalNames() {
        return capitalNames;
    }

    public int getPopulation() {
        return population;
    }

    public double getMileage() {
        return mileage;
    }



    public void setCapitalNames(String capitalNames) {
        this.capitalNames = capitalNames;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
















}
