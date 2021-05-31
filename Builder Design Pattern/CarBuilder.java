package BuilderDesignPattern;

public class Car {

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
	
	public Car(String model, String color, String fuelType, String engine, String breaks, 
			int cost, int seats, double mileage_kmpl, boolean navigationSystem, boolean bluetooth)
	{
		this.model = model;
		this.color = color;
		this.fuelType = fuelType;
		this.engine = engine;
		this.breaks = breaks;
		this.cost = cost;
		this.seats = seats;
		this.mileage_kmpl = mileage_kmpl;
		this.navigationSystem = navigationSystem;
		this.bluetooth = bluetooth;
	}
	
	public String toString()
	{
		return "Car [Model="+model+", Color="+color+", Fuel Type="+fuelType+", Engine="+engine
				+", Breaks="+breaks+", Cost="+cost+", Seats="+seats+", Mileage (kmpl)="+mileage_kmpl+
				", Navigation System="+navigationSystem+", Bluetooth="+bluetooth+"]";
	}
	
}
