package org.fasttrackit;


import org.fasttrackit.cheater.UFO;

//import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
            Engine engine = new Engine();
            engine.manufacturer = "Renault";
            engine.capacity = 1500;
            // engine.expiryDate = LocalDateTime.now();


            Car car = new Car(engine);
            car.setName("Dacia");
            car.setColor("White");
            car.setMileage(7.5);
//
//
            car.doorCount = 4;
           car.runing = true;
           System.out.println(car.toString());


          // System.out.println(car.getName());

//
//           double carTraveledDistance = car.accelerate(100,2);
//
//
//
//
//
//
//
//            car.engine = engine;
//
//            car.engine.manufacturer = "BMW";
//            engine.manufacturer = "Microsoft";
//
//        engine = null;
//
//
//
//
//        Car car2 = new Car(new Engine());
//        car2.setName("sfa");

        Vehicle vehicle = new Vehicle();
        vehicle.vehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount = 2;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.vehicleCount = 3;

        System.out.println("Value from vehicle 1: " + vehicle.vehicleCount);
        System.out.println("Value from vehicle 2: " + vehicle2.vehicleCount);
        System.out.println("Value from vehicle class: " + Vehicle.vehicleCount);

        new AutoVehicle();
        new AutoVehicle(new Engine());
        vehicle.accelerate(34.12);
        vehicle2.accelerate(130, 0.8);
        new UFO().accelerate(130,0.8);
       // Polymorphism (
        Vehicle ufo = new UFO();
        ufo.accelerate(200,2);
        ((UFO) ufo).concealCheatng();
    }
}
