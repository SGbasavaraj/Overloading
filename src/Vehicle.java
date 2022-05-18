
abstract class Vehicle {
	
	private int position;
	private int speed;
	
	public Vehicle() {
		position = 10;
		speed = 2;
	}
	
	
	public int moveForward(int steps) {
		return position += speed*steps;
	} 
	public int moveBackward(int steps) {
		return position -=steps;
	}
	
	
	abstract int calculateMaintenanceCost();
	
}


