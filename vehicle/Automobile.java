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
		String[] trimPackage = AutoModel.getPackageType();
		int wheelCount = 0;
		try {
			wheelCount = Integer.parseInt(trimPackage[1]);
		}
		catch(Exception e) {
			System.out.println("Bad Trim Package, ho");
		}

		return wheelCount;
	}
	
	public int getNumDoors() {
		
		return super.doors;
	}
	
	public void getMakerandModel() {
	}
	

}


