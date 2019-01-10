package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class UFO extends Vehicle
{
   @Override
   public double accelerate(double speed, double durationInHours) {
      System.out.println("Accelerating as UFO");
      System.out.println(getName() + " accelerated with" + speed + " km/h for" + durationInHours + " hours");
      double traveledDiistance = 2 * speed * durationInHours;
      System.out.println("Traveled distance:" + traveledDiistance);


      return traveledDiistance;
   }
   public void  concealCheatng(){
      System.out.println("I'am not cheating");
   }
//example of co-variant return type
   //example of extending access priveleges in overridden method
   @Override
   public UFO clone() {
      return new UFO();
   }
}
