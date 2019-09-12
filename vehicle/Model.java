package vehicle;

public class Model {
	private String BodyType;
	private String ModelName;
	private String[] PackageType;
	
	Model() {
		BodyType = "Big rig";
		ModelName = "ASSHAULER";
		PackageType = new String[] {"Wheels", "10", "Mpg", "13", "Color", "White", "Seats", "2", "Fuelcap", "100", "weight", "3000"};
	}
	
	Model (String Bt, String Mn, String[] trimPackage) {
		BodyType = Bt;
		ModelName = Mn;
		PackageType = trimPackage;
	}
	
	public String getBodyType() {
		return BodyType;
	}
	public void setBodyType(String bodyType) {
		BodyType = bodyType;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String[] getPackageType() {
		return PackageType;
	}

	public void setPackageType(String[] packageType) {
		PackageType = packageType;
	}

	
	
}
	

