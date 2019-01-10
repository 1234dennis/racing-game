package org.fasttrackit;

public class AutoVehicle extends Vehicle
{
    Engine engine;
    boolean runing;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

  //  @Override
   // public String toString() {
      //  return super.toString();
    // }

    public AutoVehicle() {
        //this.engine = new Engine();
    this(new Engine());

    }
}
