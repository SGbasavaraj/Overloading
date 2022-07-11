
class Test {
	public static void main(String args[]) {
	Car c1=new Car(25);
	Bicycle b1 = new Bicycle(10);
	
	System.out.println(b1.calculateMaintenanceCost());
	System.out.println(c1.calculateMaintenanceCost());
	
	c1.start();
	b1.start();
	}

}
