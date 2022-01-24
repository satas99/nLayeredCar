package nLayeredCar.business.abstracts;

import nLayeredCar.entities.concretes.Car;

public interface CarService {
	void add(Car car);
	void update(Car car);
	void delete(Car car);

}
