package nLayeredCar.dataAccess.abstracts;

import nLayeredCar.entities.concretes.Car;

public interface CarDao {
	void add(Car car);
	void update(Car car);
	void delete(Car car);
}
