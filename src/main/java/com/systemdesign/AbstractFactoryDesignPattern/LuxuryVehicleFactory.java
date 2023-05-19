package com.systemdesign.AbstractFactoryDesignPattern;

public class LuxuryVehicleFactory implements VehicleFactory{
	@Override
	public Vehicle createVehicle() {
		return new LuxuryVehicle();
	}
	@Override
	public VehicleModel createVehicleModel() {
		return new LuxuryVehicleModel();
	}
}
