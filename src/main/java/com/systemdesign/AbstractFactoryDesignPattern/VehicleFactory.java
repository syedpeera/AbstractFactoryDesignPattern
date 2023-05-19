package com.systemdesign.AbstractFactoryDesignPattern;
//Abstract Factory
public interface VehicleFactory {
	public Vehicle createVehicle();
	public VehicleModel createVehicleModel();
}
