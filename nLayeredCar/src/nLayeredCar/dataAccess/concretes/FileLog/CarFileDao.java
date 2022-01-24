package nLayeredCar.dataAccess.concretes.FileLog;

import nLayeredCar.dataAccess.abstracts.CarLogDao;
import nLayeredCar.entities.concretes.Car;

public class CarFileDao implements CarLogDao {

	@Override
	public void log(Car car) {
		System.out.println("File'a loglandý");
		
	}

}
