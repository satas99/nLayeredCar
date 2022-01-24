package nLayeredCar.dataAccess.concretes.MsSqlimpls;

import nLayeredCar.dataAccess.abstracts.CarDao;
import nLayeredCar.entities.concretes.Car;

public class CarMsSqlDao implements CarDao{

	@Override
	public void add(Car car) {
		System.out.println("MsSql'e eklendi");
		
	}

	@Override
	public void update(Car car) {
		System.out.println("MsSql'de güncellendi");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println("MsSql'de silindi");
		
	}

}
