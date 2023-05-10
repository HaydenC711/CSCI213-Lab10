public class Car extends Vehicle{
	private int doors;
	private int passengers;
	
	public Car(String make, String model, String plate, int doors, int passengers){
		super(make, model, plate);
		this.doors = doors;
		this.passengers = passengers;
	}
		
	public int getDoors() {
		return this.doors;
	}
		
	public int getPassengers() {
		return this.passengers;
	}
		
	public String toString(){
		return String.format("%d -door %s %s with license %s", this.doors, super.getMake(), super.getPlate());
	}
		
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		// check current instance variables
		// then check super instance variables (super.equals)
		if(this.doors == otherCar.getDoors() && this.passengers == otherCar.getPassengers()) {
			return super.equals(other);
		}
		
		return false;
	}
	
	
	public Car copy() {
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		
		
		Car newCar = new Car(super.getMake(), super.getModel(), super.getPlate(), doors, passengers);
		
		return newCar;
	}
}