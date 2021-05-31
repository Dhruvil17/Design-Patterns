package BuilderDesignPattern;

public class Showroom {

	public static void main(String[] args) {
		
		// Without Builder Design Pattern
//		Car car = new Car("Wagon R", "White", "Petrol", "High Speed", "Disc Brakes", 450000, 
//				4, 20.52, true, false);
//		System.out.println(car);
		
		
		// With Builder Design Pattern
		CarBuilder builder = new CarBuilder();
		
		builder.setModel("Sedan").setMileage_kmpl(17.5).setCost(700000).setEngine("Medium Speed")
		.setNavigationSystem(true).setSeats(4);
		System.out.println(builder.getCar());
		
	}
}
