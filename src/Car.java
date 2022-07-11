class Car implements Vehicle {
	
	static int FUEL_CAPACITY = 50;
	private int fuel;
	
	public Car(int fuel) {
		this.fuel=fuel;
	}
	
	public int calculateMaintenanceCost() {
		return FUEL_CAPACITY-fuel;
	}
	
	public boolean start() {
		if(fuel>0) {
			System.out.println("Start by ingnition ");
			return true;
		}
		else {
			System.out.println("car coudnt start ");
			return false;
		}
	}
	
}
