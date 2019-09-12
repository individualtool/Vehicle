package vehicle;

 abstract class Vehicle {
	int passengers; // number of passengers 
	int fuelcap;    // fuel capacity in gallons
	int mpg;		// fuel consumption in gallons
	int doors;      // numbers of doors
	int tiresize;  // size of tires in inches
	String color;   // color of car
	int weight;     // weight of car in lbs
	int totalmiles; // mileage car has
	public int topspeed;   // top speed of car
	public int speed;      // current speed of car
	int fuellevel;  // current fuel level of car
	public String horn;    // sound of horn
	public static String key = "WPS";     // the correct key to start car

	// default constructor
	Vehicle() {
	}

	//constructor with 9 variables
	Vehicle(int p, int f, int m, int d, int ts, int w, int tm, int TS){
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = d;
		tiresize = ts;
		weight = w;
		totalmiles = tm;
		topspeed = TS;
	}

	public String honkHorn() {
		String honkHorn = "boop!";
		return honkHorn;
	}
	String color(String x) {
		return x;
	}
	int range() {	
		return mpg * fuelcap;
	}
	double fuelneeded(int miles) {
		return(double) miles /mpg;
	}	
	double refill(int miles) {
		return(double) miles / range();
	}


	private String accelerate() {
		String motion = "Accelerating....";   // describes behavior in a private method
		return motion;	
	}

	public void getCar() {
		System.out.println(accelerate());
	}

	private String brake1(){
		String stopping= " ...Applying brakes..";
		return stopping;
	}

	public void getCar2(){
		System.out.println(brake1());
	}


	public static boolean startCar(String usedKey) {

		if (usedKey == key)
			return true; // car starts

		else
			return false;
	}
}

class VehicleMarcus {
	public static void main(String[] args){
	
}
}
	