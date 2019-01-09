package org.fasttrackit;

/**
 * Hello world!
 *fdsafdas
 * fdsa
 * fdsa
 * fdsa
 * fdsa
 */

// this is a comment
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
         //engine.expiryDate = LocalDateTime.now();


        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("White");
        car.setMileage(7.5);


        car.doorCount = 4;
       car.runing = true;
       System.out.println(car.getName());
       

       double carTraveledDistance = car.accelerate(100,2);







        car.engine = engine;

        car.engine.manufacturer = "BMW";
        engine.manufacturer = "Microsoft";

        engine = null;




        Car car2 = new Car(new Engine());
        car2.setName("sfa");
        // some new content
    }
}
