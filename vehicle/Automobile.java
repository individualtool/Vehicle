package vehicle;

public class Automobile extends Vehicle {
	private boolean Trunk;
	private boolean AC;
	private boolean Tint;
	private String Owner;
	private String Title;
	
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
		return 0;
	}
	public int getNumDoors() {
		return 0;
	}
	
	public void getModel() {
	}
	
	public void getMaker() {
	}
}


