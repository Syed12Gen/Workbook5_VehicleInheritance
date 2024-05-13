package com.ps;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car car = new Car();
        car.setColor("Black");
        car.setFuelCapacity(40);

        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setColor("Black");
        bigTruck.setCargoCapacity(10000);

        Hovercraft myHovercraft = new Hovercraft();
        myHovercraft.setColor("White");
        myHovercraft.setFuelCapacity(300);

        System.out.println("The " + slowRide.getColor() + " moped has a fuel capacity of " + slowRide.getFuelCapacity() + " gallons.");
        System.out.println("The " + car.getColor() + " car has a fuel capacity of " + car.getFuelCapacity() + " gallons.");
        System.out.println("The " + bigTruck.getColor() + " semi-truck has a cargo capacity of " + bigTruck.getCargoCapacity() + " pounds.");
        System.out.println("The " + myHovercraft.getColor() + " hovercraft has a fuel capacity of " + myHovercraft.getFuelCapacity() + " gallons.");

    }
}