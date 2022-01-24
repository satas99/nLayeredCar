package nLayeredCar.entities.concretes;

public class Car {
	private int id;
	private String name;
	private CarBrand brand;
	private CarColor color;
	public Car() {
		super();
	}
	public Car(int id, String name, CarBrand brand, CarColor color) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.color = color;
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
	public CarBrand getBrand() {
		return brand;
	}
	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}
	public CarColor getColor() {
		return color;
	}
	public void setColor(CarColor color) {
		this.color = color;
	}
	
}