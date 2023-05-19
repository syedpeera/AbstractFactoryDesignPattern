package com.systemdesign.AbstractFactoryDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryDesignPatternApplication.class, args);
		VehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
		Vehicle luxuryVehicle = luxuryVehicleFactory.createVehicle();
		VehicleModel luxuryVehicleModel = luxuryVehicleFactory.createVehicleModel();
		luxuryVehicle.drive();
		luxuryVehicleModel.displayInfo();
		
		VehicleFactory ordinaryVehicleFactory = new OrdinaryVehicleFactory();
		Vehicle ordinaryVehicle = ordinaryVehicleFactory.createVehicle();
		VehicleModel ordinaryVehicleModel = ordinaryVehicleFactory.createVehicleModel();
		ordinaryVehicle.drive();
		ordinaryVehicleModel.displayInfo();
	}
}
