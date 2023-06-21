package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    public Boat(String name,int capacity)
    {
        this.name=name;
        this.capacity=capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getVehicleName()
    {
        return this.name;
    }
    public int getVehicleCapacity()
    {
        return this.capacity;
    }
}
