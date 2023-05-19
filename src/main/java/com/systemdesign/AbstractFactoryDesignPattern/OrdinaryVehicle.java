package com.systemdesign.AbstractFactoryDesignPattern;

public class OrdinaryVehicle implements Vehicle{
	@Override
	public void drive() {
		System.out.println("Driving an Ordinary Vehicle.");
	}
}
