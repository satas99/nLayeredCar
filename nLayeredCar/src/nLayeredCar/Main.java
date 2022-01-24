package nLayeredCar;

import nLayeredCar.business.abstracts.CarService;
import nLayeredCar.business.concretes.CarManager;
import nLayeredCar.dataAccess.concretes.FileLog.CarFileDao;
import nLayeredCar.dataAccess.concretes.Oracleimpls.CarOracleDao;
import nLayeredCar.entities.concretes.Car;
import nLayeredCar.entities.concretes.CarBrand;
import nLayeredCar.entities.concretes.CarColor;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(1, "Renault",new CarBrand(1,"asdad"), new CarColor(2,"sadad"));
		CarService manager = new CarManager(new CarOracleDao(),new CarFileDao());
		manager.update(car);
		

	}

}
