/*
 * @Author: Kevin
 */
package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Car> carList = new ArrayList<>();
		
		System.out.println("Welcome to the Grand Circus Motors admin console! \n");
		int enteredCars = 1;
		int carCount = Validator.getInt(scan, "How many cars are you entering? ");
		for (int i = 0; i < carCount; i++) {
		String carMake = Validator.getString(scan, "Enter Car #" + enteredCars + " Make: ");
		String carModel = Validator.getString(scan, "Enter Car #" + enteredCars + " Model: ");
		int carYear = Validator.getInt(scan, "Enter Car #" + enteredCars + " Year: ");
		double carPrice = Validator.getDouble(scan, "Enter Car #" + enteredCars + " Price:");
		carList.add(new Car(carMake, carModel, carYear, carPrice));
		enteredCars++;
		}
		
		System.out.println();
		
		carList.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		carList.add(new Car("Ford", "Escape", 2016, 31999.90));
		carList.add(new Car("Toyota", "Prius", 2017, 34555.86));
		carList.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		carList.add(new UsedCar("GC", "Chirpus", 2013, 8500, 12345));
		carList.add(new UsedCar("GC", "Witherell", 2016, 14450, 3500.3));

		int carNumber = 1;
		int userChoice = 0;
		
		while (userChoice != carNumber) {
			System.out.println("Current inventory: ");
			for (Car cars : carList) {
				System.out.print(carNumber++ + ". " + cars + "\n");
			}
			System.out.println(carNumber + ". Quit ");

			userChoice = Validator.getInt(scan, "\nWhich car would you like?", 1, carNumber);
			
			try {
				System.out.println(carList.get(userChoice - 1));
				String toBuy = Validator.getString(scan, "\nWould you like to buy this car? (y/n):\n");
				if (toBuy.equalsIgnoreCase("y")) {
					carList.remove(userChoice - 1);
					System.out.println("Excellent! Our finance team will be in touch shortly.\n");
					carNumber = 1;
					userChoice = 0;
				} else {
					carNumber = 1;
					userChoice = 0;
				} 
			} catch (IndexOutOfBoundsException e) {
				carNumber = 1;
				userChoice = 1;
			}
		}
		
		System.out.println("\nThank you for your business! Have a nice day!");
	}

}
