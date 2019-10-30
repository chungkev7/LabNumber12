package co.grandcircus;

public class Car {
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	
	public Car() {
		super();
	}

	public Car(String make, String model, int year, double price) {
		super();
		this.carMake = make;
		this.carModel = model;
		this.carYear = year;
		this.carPrice = price;
	}

	public String getMake() {
		return carMake;
	}

	public void setMake(String make) {
		this.carMake = make;
	}

	public String getModel() {
		return carModel;
	}

	public void setModel(String model) {
		this.carModel = model;
	}

	public int getYear() {
		return carYear;
	}

	public void setYear(int year) {
		this.carYear = year;
	}

	public double getPrice() {
		return carPrice;
	}

	public void setPrice(double price) {
		this.carPrice = price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %-8d $%-10.2f", carMake, carModel, carYear, carPrice);
	}
	
	
}
