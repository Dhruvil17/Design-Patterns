package BuilderDesignPattern;

public class CarBuilder {

	private String model;
	private String color;
	private String fuelType;
	private String engine;
	private String breaks;
	private int cost;
	private int seats;
	private double mileage_kmpl;
	private boolean navigationSystem;
	private boolean bluetooth;
	
	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	public CarBuilder setFuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}
	public CarBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}
	public CarBuilder setBreaks(String breaks) {
		this.breaks = breaks;
		return this;
	}
	public CarBuilder setCost(int cost) {
		this.cost = cost;
		return this;
	}
	public CarBuilder setSeats(int seats) {
		this.seats = seats;
		return this;
	}
	public CarBuilder setMileage_kmpl(double mileage_kmpl) {
		this.mileage_kmpl = mileage_kmpl;
		return this;
	}
	public CarBuilder setNavigationSystem(boolean navigationSystem) {
		this.navigationSystem = navigationSystem;
		return this;
	}
	public CarBuilder setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
		return this;
	}
	public Car getCar()
	{
		return new Car(model, color, fuelType, engine, breaks, cost, seats, mileage_kmpl, navigationSystem, 
				bluetooth);
	}
	
}
