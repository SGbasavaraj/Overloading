
class Bicycle implements Vehicle{
	static int AIR_CAPACITY = 20;
	private int air;
	
	public Bicycle(int air) {
		this.air=air;
	}
	
	public int calculateMaintenanceCost() {
		return AIR_CAPACITY-air;
	}
	
	public boolean start() {
		
		System.out.println("starts by pedeling ");
		return true;
	}
	


}
