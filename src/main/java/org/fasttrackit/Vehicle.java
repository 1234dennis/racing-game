package org.fasttrackit;

public class Vehicle {
   private String name;
   private String color;
   private double mileage;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " accelerated with" + speed + " km/h for" + durationInHours + " hours");
        double traveledDiistance = speed * durationInHours;
        System.out.println("Traveled distance:" + traveledDiistance);


        return traveledDiistance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}