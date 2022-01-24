package nLayeredCar.dataAccess.concretes.DBLog;

import nLayeredCar.dataAccess.abstracts.CarLogDao;
import nLayeredCar.entities.concretes.Car;

public class CarDatabaseDao implements CarLogDao{

	@Override
	public void log(Car car) {
		System.out.println("Database'e loglandý");
		
	}

}