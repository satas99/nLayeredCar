package nLayeredCar.business.concretes;

import nLayeredCar.business.abstracts.CarService;
import nLayeredCar.dataAccess.abstracts.CarDao;
import nLayeredCar.dataAccess.abstracts.CarLogDao;
import nLayeredCar.entities.concretes.Car;

public class CarManager implements CarService {
	private CarDao carDao;
	private CarLogDao carLogDao;
	
	public CarManager() {
		super();
	}
	

	public CarManager(CarDao carDao, CarLogDao carLogDao) {
		super();
		this.carDao = carDao;
		this.carLogDao = carLogDao;
	}

	@Override
	public void add(Car car) {
		if(car.getName()=="BMW") {
			this.carLogDao.log(car);
		}
		else {
			
			this.carDao.add(car);
		}
		
	}
	@Override
	public void update(Car car) {
		this.carDao.update(car);
		
	}


	@Override
	public void delete(Car car) {
		this.carDao.delete(car);
		
	}

}
