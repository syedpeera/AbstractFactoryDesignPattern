package com.systemdesign.AbstractFactoryDesignPattern;

public class OrdinaryVehicleFactory implements VehicleFactory{
	@Override
	public Vehicle createVehicle() {
		return new OrdinaryVehicle();
	}
	@Override
	public VehicleModel createVehicleModel() {
		return new OrdinaryVehicleModel();
	}
}