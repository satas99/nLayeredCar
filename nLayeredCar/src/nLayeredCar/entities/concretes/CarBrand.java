package nLayeredCar.entities.concretes;

import java.util.List;

public class CarBrand {
	private int id;
	private String name;
	private List<Car> cars;
	
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public CarBrand() {
		super();
	}
	public CarBrand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
