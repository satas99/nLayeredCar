package nLayeredCar.dataAccess.concretes.Oracleimpls;

import nLayeredCar.dataAccess.abstracts.CarDao;
import nLayeredCar.entities.concretes.Car;

public class CarOracleDao implements CarDao {

	@Override
	public void add(Car car) {
		System.out.println("Oracle'a eklendi");
		
	}

	@Override
	public void update(Car car) {
		System.out.println("Oracle'da güncellendi");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println("Oracle'da silindi");
		
	}

}
