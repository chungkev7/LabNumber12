package co.grandcircus;

public class UsedCar extends Car {
	private double carMileage;

	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.carMileage = mileage;
	}

	public double getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(double carMileage) {
		this.carMileage = carMileage;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" Used: %-9.2f miles", carMileage);
	}

	
	
}
