package vehicle;

public class Automobile extends Vehicle {
	private boolean Trunk;
	private boolean AC;
	private boolean Tint;
	private String Owner;
	private String Title;
	public Maker AutoMake;
	public Model AutoModel;
	
	Automobile() {
		super();
		Trunk = true;
		AC = true;
		Tint = false;
		Owner = "Batman";
		Title = "Batman's hoopty";
		AutoMake = new Maker();
		AutoModel = new Model();
		updateVehicle();
	}
	
	Automobile(int p, int f, int m, Maker aMk, Model aMl) {
		super(p, f, m);
		Trunk = true;
		AC = true;
		Tint = false;
		Owner = "Batman";
		Title = "Batman's hoopty";
		AutoMake = aMk;
		AutoModel= aMl;
		updateVehicle();
	}
	
	Automobile(int p, int f, int m, int d, String cr, int ts, int w, int tm, int TS, boolean T, boolean aC, boolean tt, String Own, String ttl, Maker aMk, Model aMl) {
		super( p,  f,  m,  d, cr,  ts,  w,  tm,  TS);
		Trunk = T;
		AC = aC;
		Tint = tt;
		Owner = Own;
		Title = ttl;
		AutoMake = aMk;
		AutoModel= aMl;
		updateVehicle();
		
	}
	
	public Maker getAutoMake() {
		return AutoMake;
	}
	public void setAutoMake(Maker autoMake) {
		AutoMake = autoMake;
	}
	public Model getAutoModel() {
		return AutoModel;
	}
	public void setAutoModel(Model autoModel) {
		AutoModel = autoModel;
	}
	public boolean isTrunk() {
		return Trunk;
	}
	public void setTrunk(boolean trunk) {
		Trunk = trunk;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public boolean isTint() {
		return Tint;
	}
	public void setTint(boolean tint) {
		Tint = tint;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
	public int getNumWheels() {
		String[] TrimPackage = AutoModel.getTrimPackage();
		int wheelCount = 0;
		try {
			wheelCount = Integer.parseInt(TrimPackage[1]);
		}
		catch(Exception e) {
			System.out.println("Bad Trim Package, ho");
		}

		return wheelCount;
	}
	
	private void updateVehicle() {
	String[] trimPackage = AutoModel.getTrimPackage();
	int  Mpg, pass, fuelcap;
	int weight;
	String color = trimPackage[5];
	
	try {
		Mpg = Integer.parseInt(trimPackage[3]);
		pass = Integer.parseInt(trimPackage[7]);
		fuelcap = Integer.parseInt(trimPackage[9]);
		weight = Integer.parseInt(trimPackage[11]);
		
	}
	catch(Exception e) {
		Mpg = 13;
		pass = 2;
		fuelcap = 100;
		weight = 3000;
		
		System.out.println("Bad Trim Package");
	}
	
	super.mpg = Mpg;
	super.passengers = pass;
	super.fuelcap = fuelcap;
	super.weight = weight;
	super.color = color;
	}
	
	public int getNumDoors() {
		
		return super.doors;
	}
	
	public void getMakerandModel() {
		AutoMake.getMake();
		System.out.println(AutoModel.getModelName());
	}
	

}


